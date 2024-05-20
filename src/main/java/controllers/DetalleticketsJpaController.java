/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import models.Detalletickets;
import models.DetalleticketsPK;
import models.Productos;
import models.Tickets;

/**
 *
 * @author clara
 */
public class DetalleticketsJpaController implements Serializable {

    public DetalleticketsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalletickets detalletickets) throws PreexistingEntityException, Exception {
        if (detalletickets.getDetalleticketsPK() == null) {
            detalletickets.setDetalleticketsPK(new DetalleticketsPK());
        }
        detalletickets.getDetalleticketsPK().setIdTicket(detalletickets.getTickets().getIdTicket());
        detalletickets.getDetalleticketsPK().setIdProducto(detalletickets.getProductos().getIdProducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos productos = detalletickets.getProductos();
            if (productos != null) {
                productos = em.getReference(productos.getClass(), productos.getIdProducto());
                detalletickets.setProductos(productos);
            }
            Tickets tickets = detalletickets.getTickets();
            if (tickets != null) {
                tickets = em.getReference(tickets.getClass(), tickets.getIdTicket());
                detalletickets.setTickets(tickets);
            }
            em.persist(detalletickets);
            if (productos != null) {
                productos.getDetalleticketsCollection().add(detalletickets);
                productos = em.merge(productos);
            }
            if (tickets != null) {
                tickets.getDetalleticketsCollection().add(detalletickets);
                tickets = em.merge(tickets);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDetalletickets(detalletickets.getDetalleticketsPK()) != null) {
                throw new PreexistingEntityException("Detalletickets " + detalletickets + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalletickets detalletickets) throws NonexistentEntityException, Exception {
        detalletickets.getDetalleticketsPK().setIdTicket(detalletickets.getTickets().getIdTicket());
        detalletickets.getDetalleticketsPK().setIdProducto(detalletickets.getProductos().getIdProducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalletickets persistentDetalletickets = em.find(Detalletickets.class, detalletickets.getDetalleticketsPK());
            Productos productosOld = persistentDetalletickets.getProductos();
            Productos productosNew = detalletickets.getProductos();
            Tickets ticketsOld = persistentDetalletickets.getTickets();
            Tickets ticketsNew = detalletickets.getTickets();
            if (productosNew != null) {
                productosNew = em.getReference(productosNew.getClass(), productosNew.getIdProducto());
                detalletickets.setProductos(productosNew);
            }
            if (ticketsNew != null) {
                ticketsNew = em.getReference(ticketsNew.getClass(), ticketsNew.getIdTicket());
                detalletickets.setTickets(ticketsNew);
            }
            detalletickets = em.merge(detalletickets);
            if (productosOld != null && !productosOld.equals(productosNew)) {
                productosOld.getDetalleticketsCollection().remove(detalletickets);
                productosOld = em.merge(productosOld);
            }
            if (productosNew != null && !productosNew.equals(productosOld)) {
                productosNew.getDetalleticketsCollection().add(detalletickets);
                productosNew = em.merge(productosNew);
            }
            if (ticketsOld != null && !ticketsOld.equals(ticketsNew)) {
                ticketsOld.getDetalleticketsCollection().remove(detalletickets);
                ticketsOld = em.merge(ticketsOld);
            }
            if (ticketsNew != null && !ticketsNew.equals(ticketsOld)) {
                ticketsNew.getDetalleticketsCollection().add(detalletickets);
                ticketsNew = em.merge(ticketsNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                DetalleticketsPK id = detalletickets.getDetalleticketsPK();
                if (findDetalletickets(id) == null) {
                    throw new NonexistentEntityException("The detalletickets with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(DetalleticketsPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalletickets detalletickets;
            try {
                detalletickets = em.getReference(Detalletickets.class, id);
                detalletickets.getDetalleticketsPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalletickets with id " + id + " no longer exists.", enfe);
            }
            Productos productos = detalletickets.getProductos();
            if (productos != null) {
                productos.getDetalleticketsCollection().remove(detalletickets);
                productos = em.merge(productos);
            }
            Tickets tickets = detalletickets.getTickets();
            if (tickets != null) {
                tickets.getDetalleticketsCollection().remove(detalletickets);
                tickets = em.merge(tickets);
            }
            em.remove(detalletickets);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalletickets> findDetalleticketsEntities() {
        return findDetalleticketsEntities(true, -1, -1);
    }

    public List<Detalletickets> findDetalleticketsEntities(int maxResults, int firstResult) {
        return findDetalleticketsEntities(false, maxResults, firstResult);
    }

    private List<Detalletickets> findDetalleticketsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalletickets.class));
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

    public Detalletickets findDetalletickets(DetalleticketsPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalletickets.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleticketsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalletickets> rt = cq.from(Detalletickets.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
