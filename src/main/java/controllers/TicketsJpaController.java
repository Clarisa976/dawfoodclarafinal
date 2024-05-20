/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.exceptions.IllegalOrphanException;
import controllers.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import models.Tpv;
import models.Detalletickets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import models.Tickets;

/**
 *
 * @author clara
 */
public class TicketsJpaController implements Serializable {

    public TicketsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tickets tickets) {
        if (tickets.getDetalleticketsCollection() == null) {
            tickets.setDetalleticketsCollection(new ArrayList<Detalletickets>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tpv idTpv = tickets.getIdTpv();
            if (idTpv != null) {
                idTpv = em.getReference(idTpv.getClass(), idTpv.getIdTpv());
                tickets.setIdTpv(idTpv);
            }
            Collection<Detalletickets> attachedDetalleticketsCollection = new ArrayList<Detalletickets>();
            for (Detalletickets detalleticketsCollectionDetalleticketsToAttach : tickets.getDetalleticketsCollection()) {
                detalleticketsCollectionDetalleticketsToAttach = em.getReference(detalleticketsCollectionDetalleticketsToAttach.getClass(), detalleticketsCollectionDetalleticketsToAttach.getDetalleticketsPK());
                attachedDetalleticketsCollection.add(detalleticketsCollectionDetalleticketsToAttach);
            }
            tickets.setDetalleticketsCollection(attachedDetalleticketsCollection);
            em.persist(tickets);
            if (idTpv != null) {
                idTpv.getTicketsCollection().add(tickets);
                idTpv = em.merge(idTpv);
            }
            for (Detalletickets detalleticketsCollectionDetalletickets : tickets.getDetalleticketsCollection()) {
                Tickets oldTicketsOfDetalleticketsCollectionDetalletickets = detalleticketsCollectionDetalletickets.getTickets();
                detalleticketsCollectionDetalletickets.setTickets(tickets);
                detalleticketsCollectionDetalletickets = em.merge(detalleticketsCollectionDetalletickets);
                if (oldTicketsOfDetalleticketsCollectionDetalletickets != null) {
                    oldTicketsOfDetalleticketsCollectionDetalletickets.getDetalleticketsCollection().remove(detalleticketsCollectionDetalletickets);
                    oldTicketsOfDetalleticketsCollectionDetalletickets = em.merge(oldTicketsOfDetalleticketsCollectionDetalletickets);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tickets tickets) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tickets persistentTickets = em.find(Tickets.class, tickets.getIdTicket());
            Tpv idTpvOld = persistentTickets.getIdTpv();
            Tpv idTpvNew = tickets.getIdTpv();
            Collection<Detalletickets> detalleticketsCollectionOld = persistentTickets.getDetalleticketsCollection();
            Collection<Detalletickets> detalleticketsCollectionNew = tickets.getDetalleticketsCollection();
            List<String> illegalOrphanMessages = null;
            for (Detalletickets detalleticketsCollectionOldDetalletickets : detalleticketsCollectionOld) {
                if (!detalleticketsCollectionNew.contains(detalleticketsCollectionOldDetalletickets)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Detalletickets " + detalleticketsCollectionOldDetalletickets + " since its tickets field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idTpvNew != null) {
                idTpvNew = em.getReference(idTpvNew.getClass(), idTpvNew.getIdTpv());
                tickets.setIdTpv(idTpvNew);
            }
            Collection<Detalletickets> attachedDetalleticketsCollectionNew = new ArrayList<Detalletickets>();
            for (Detalletickets detalleticketsCollectionNewDetalleticketsToAttach : detalleticketsCollectionNew) {
                detalleticketsCollectionNewDetalleticketsToAttach = em.getReference(detalleticketsCollectionNewDetalleticketsToAttach.getClass(), detalleticketsCollectionNewDetalleticketsToAttach.getDetalleticketsPK());
                attachedDetalleticketsCollectionNew.add(detalleticketsCollectionNewDetalleticketsToAttach);
            }
            detalleticketsCollectionNew = attachedDetalleticketsCollectionNew;
            tickets.setDetalleticketsCollection(detalleticketsCollectionNew);
            tickets = em.merge(tickets);
            if (idTpvOld != null && !idTpvOld.equals(idTpvNew)) {
                idTpvOld.getTicketsCollection().remove(tickets);
                idTpvOld = em.merge(idTpvOld);
            }
            if (idTpvNew != null && !idTpvNew.equals(idTpvOld)) {
                idTpvNew.getTicketsCollection().add(tickets);
                idTpvNew = em.merge(idTpvNew);
            }
            for (Detalletickets detalleticketsCollectionNewDetalletickets : detalleticketsCollectionNew) {
                if (!detalleticketsCollectionOld.contains(detalleticketsCollectionNewDetalletickets)) {
                    Tickets oldTicketsOfDetalleticketsCollectionNewDetalletickets = detalleticketsCollectionNewDetalletickets.getTickets();
                    detalleticketsCollectionNewDetalletickets.setTickets(tickets);
                    detalleticketsCollectionNewDetalletickets = em.merge(detalleticketsCollectionNewDetalletickets);
                    if (oldTicketsOfDetalleticketsCollectionNewDetalletickets != null && !oldTicketsOfDetalleticketsCollectionNewDetalletickets.equals(tickets)) {
                        oldTicketsOfDetalleticketsCollectionNewDetalletickets.getDetalleticketsCollection().remove(detalleticketsCollectionNewDetalletickets);
                        oldTicketsOfDetalleticketsCollectionNewDetalletickets = em.merge(oldTicketsOfDetalleticketsCollectionNewDetalletickets);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tickets.getIdTicket();
                if (findTickets(id) == null) {
                    throw new NonexistentEntityException("The tickets with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tickets tickets;
            try {
                tickets = em.getReference(Tickets.class, id);
                tickets.getIdTicket();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tickets with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Detalletickets> detalleticketsCollectionOrphanCheck = tickets.getDetalleticketsCollection();
            for (Detalletickets detalleticketsCollectionOrphanCheckDetalletickets : detalleticketsCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Tickets (" + tickets + ") cannot be destroyed since the Detalletickets " + detalleticketsCollectionOrphanCheckDetalletickets + " in its detalleticketsCollection field has a non-nullable tickets field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Tpv idTpv = tickets.getIdTpv();
            if (idTpv != null) {
                idTpv.getTicketsCollection().remove(tickets);
                idTpv = em.merge(idTpv);
            }
            em.remove(tickets);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tickets> findTicketsEntities() {
        return findTicketsEntities(true, -1, -1);
    }

    public List<Tickets> findTicketsEntities(int maxResults, int firstResult) {
        return findTicketsEntities(false, maxResults, firstResult);
    }

    private List<Tickets> findTicketsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tickets.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Tickets findTickets(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tickets.class, id);
        } finally {
            em.close();
        }
    }

    public int getTicketsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tickets> rt = cq.from(Tickets.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
