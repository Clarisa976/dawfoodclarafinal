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
import models.Tipoproducto;
import models.Detalletickets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import models.Productos;

/**
 *
 * @author clara
 */
public class ProductosJpaController implements Serializable {

    public ProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productos productos) {
        if (productos.getDetalleticketsCollection() == null) {
            productos.setDetalleticketsCollection(new ArrayList<Detalletickets>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipoproducto idTipoProducto = productos.getIdTipoProducto();
            if (idTipoProducto != null) {
                idTipoProducto = em.getReference(idTipoProducto.getClass(), idTipoProducto.getIdTipoProducto());
                productos.setIdTipoProducto(idTipoProducto);
            }
            Collection<Detalletickets> attachedDetalleticketsCollection = new ArrayList<Detalletickets>();
            for (Detalletickets detalleticketsCollectionDetalleticketsToAttach : productos.getDetalleticketsCollection()) {
                detalleticketsCollectionDetalleticketsToAttach = em.getReference(detalleticketsCollectionDetalleticketsToAttach.getClass(), detalleticketsCollectionDetalleticketsToAttach.getDetalleticketsPK());
                attachedDetalleticketsCollection.add(detalleticketsCollectionDetalleticketsToAttach);
            }
            productos.setDetalleticketsCollection(attachedDetalleticketsCollection);
            em.persist(productos);
            if (idTipoProducto != null) {
                idTipoProducto.getProductosCollection().add(productos);
                idTipoProducto = em.merge(idTipoProducto);
            }
            for (Detalletickets detalleticketsCollectionDetalletickets : productos.getDetalleticketsCollection()) {
                Productos oldProductosOfDetalleticketsCollectionDetalletickets = detalleticketsCollectionDetalletickets.getProductos();
                detalleticketsCollectionDetalletickets.setProductos(productos);
                detalleticketsCollectionDetalletickets = em.merge(detalleticketsCollectionDetalletickets);
                if (oldProductosOfDetalleticketsCollectionDetalletickets != null) {
                    oldProductosOfDetalleticketsCollectionDetalletickets.getDetalleticketsCollection().remove(detalleticketsCollectionDetalletickets);
                    oldProductosOfDetalleticketsCollectionDetalletickets = em.merge(oldProductosOfDetalleticketsCollectionDetalletickets);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos persistentProductos = em.find(Productos.class, productos.getIdProducto());
            Tipoproducto idTipoProductoOld = persistentProductos.getIdTipoProducto();
            Tipoproducto idTipoProductoNew = productos.getIdTipoProducto();
            Collection<Detalletickets> detalleticketsCollectionOld = persistentProductos.getDetalleticketsCollection();
            Collection<Detalletickets> detalleticketsCollectionNew = productos.getDetalleticketsCollection();
            List<String> illegalOrphanMessages = null;
            for (Detalletickets detalleticketsCollectionOldDetalletickets : detalleticketsCollectionOld) {
                if (!detalleticketsCollectionNew.contains(detalleticketsCollectionOldDetalletickets)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Detalletickets " + detalleticketsCollectionOldDetalletickets + " since its productos field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idTipoProductoNew != null) {
                idTipoProductoNew = em.getReference(idTipoProductoNew.getClass(), idTipoProductoNew.getIdTipoProducto());
                productos.setIdTipoProducto(idTipoProductoNew);
            }
            Collection<Detalletickets> attachedDetalleticketsCollectionNew = new ArrayList<Detalletickets>();
            for (Detalletickets detalleticketsCollectionNewDetalleticketsToAttach : detalleticketsCollectionNew) {
                detalleticketsCollectionNewDetalleticketsToAttach = em.getReference(detalleticketsCollectionNewDetalleticketsToAttach.getClass(), detalleticketsCollectionNewDetalleticketsToAttach.getDetalleticketsPK());
                attachedDetalleticketsCollectionNew.add(detalleticketsCollectionNewDetalleticketsToAttach);
            }
            detalleticketsCollectionNew = attachedDetalleticketsCollectionNew;
            productos.setDetalleticketsCollection(detalleticketsCollectionNew);
            productos = em.merge(productos);
            if (idTipoProductoOld != null && !idTipoProductoOld.equals(idTipoProductoNew)) {
                idTipoProductoOld.getProductosCollection().remove(productos);
                idTipoProductoOld = em.merge(idTipoProductoOld);
            }
            if (idTipoProductoNew != null && !idTipoProductoNew.equals(idTipoProductoOld)) {
                idTipoProductoNew.getProductosCollection().add(productos);
                idTipoProductoNew = em.merge(idTipoProductoNew);
            }
            for (Detalletickets detalleticketsCollectionNewDetalletickets : detalleticketsCollectionNew) {
                if (!detalleticketsCollectionOld.contains(detalleticketsCollectionNewDetalletickets)) {
                    Productos oldProductosOfDetalleticketsCollectionNewDetalletickets = detalleticketsCollectionNewDetalletickets.getProductos();
                    detalleticketsCollectionNewDetalletickets.setProductos(productos);
                    detalleticketsCollectionNewDetalletickets = em.merge(detalleticketsCollectionNewDetalletickets);
                    if (oldProductosOfDetalleticketsCollectionNewDetalletickets != null && !oldProductosOfDetalleticketsCollectionNewDetalletickets.equals(productos)) {
                        oldProductosOfDetalleticketsCollectionNewDetalletickets.getDetalleticketsCollection().remove(detalleticketsCollectionNewDetalletickets);
                        oldProductosOfDetalleticketsCollectionNewDetalletickets = em.merge(oldProductosOfDetalleticketsCollectionNewDetalletickets);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = productos.getIdProducto();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
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
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Detalletickets> detalleticketsCollectionOrphanCheck = productos.getDetalleticketsCollection();
            for (Detalletickets detalleticketsCollectionOrphanCheckDetalletickets : detalleticketsCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the Detalletickets " + detalleticketsCollectionOrphanCheckDetalletickets + " in its detalleticketsCollection field has a non-nullable productos field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Tipoproducto idTipoProducto = productos.getIdTipoProducto();
            if (idTipoProducto != null) {
                idTipoProducto.getProductosCollection().remove(productos);
                idTipoProducto = em.merge(idTipoProducto);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
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

    public Productos findProductos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    //método para hacer una namequery en el que se buscan los productos por nombre
    //y obtenemos solo un resultado
    public  Productos findProductoByNombre(String nombreProducto) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Productos> query = em.createNamedQuery("Productos.findByNombre", Productos.class);
            query.setParameter("nombre", nombreProducto);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }
}
