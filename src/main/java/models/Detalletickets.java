/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author clara
 */
@Entity
@Table(name = "detalletickets")
@NamedQueries({
    @NamedQuery(name = "Detalletickets.findAll", query = "SELECT d FROM Detalletickets d"),
    @NamedQuery(name = "Detalletickets.findByIdTicket", query = "SELECT d FROM Detalletickets d WHERE d.detalleticketsPK.idTicket = :idTicket"),
    @NamedQuery(name = "Detalletickets.findByIdProducto", query = "SELECT d FROM Detalletickets d WHERE d.detalleticketsPK.idProducto = :idProducto"),
    @NamedQuery(name = "Detalletickets.findByCantidadProducto", query = "SELECT d FROM Detalletickets d WHERE d.cantidadProducto = :cantidadProducto")})
public class Detalletickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleticketsPK detalleticketsPK;
    @Column(name = "cantidadProducto")
    private Integer cantidadProducto;
    @JoinColumn(name = "IdProducto", referencedColumnName = "IdProducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;
    @JoinColumn(name = "IdTicket", referencedColumnName = "IdTicket", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tickets tickets;

    public Detalletickets() {
    }

    public Detalletickets(DetalleticketsPK detalleticketsPK) {
        this.detalleticketsPK = detalleticketsPK;
    }

    public Detalletickets(int idTicket, int idProducto) {
        this.detalleticketsPK = new DetalleticketsPK(idTicket, idProducto);
    }

    public DetalleticketsPK getDetalleticketsPK() {
        return detalleticketsPK;
    }

    public void setDetalleticketsPK(DetalleticketsPK detalleticketsPK) {
        this.detalleticketsPK = detalleticketsPK;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleticketsPK != null ? detalleticketsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalletickets)) {
            return false;
        }
        Detalletickets other = (Detalletickets) object;
        if ((this.detalleticketsPK == null && other.detalleticketsPK != null) || (this.detalleticketsPK != null && !this.detalleticketsPK.equals(other.detalleticketsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Detalletickets[ detalleticketsPK=" + detalleticketsPK + " ]";
    }
    
}
