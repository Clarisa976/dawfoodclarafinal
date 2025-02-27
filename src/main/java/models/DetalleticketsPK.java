/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author clara
 */
@Embeddable
public class DetalleticketsPK implements Serializable {
    //esta clase sirve para guardar la pk de detalle tickets

    @Basic(optional = false)
    @Column(name = "IdTicket")
    private int idTicket;
    @Basic(optional = false)
    @Column(name = "IdProducto")
    private int idProducto;

    public DetalleticketsPK() {
    }

    public DetalleticketsPK(int idTicket, int idProducto) {
        this.idTicket = idTicket;
        this.idProducto = idProducto;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTicket;
        hash += (int) idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleticketsPK)) {
            return false;
        }
        DetalleticketsPK other = (DetalleticketsPK) object;
        if (this.idTicket != other.idTicket) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.DetalleticketsPK[ idTicket=" + idTicket + ", idProducto=" + idProducto + " ]";
    }
    
}
