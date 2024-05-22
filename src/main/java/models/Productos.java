/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author clara
 */
@Entity
@Table(name = "productos")
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIdProducto", query = "SELECT p FROM Productos p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Productos.findByNombre", query = "SELECT p FROM Productos p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Productos.findByPrecioSinIVA", query = "SELECT p FROM Productos p WHERE p.precioSinIVA = :precioSinIVA"),
    @NamedQuery(name = "Productos.findByTipoIVA", query = "SELECT p FROM Productos p WHERE p.tipoIVA = :tipoIVA"),
    @NamedQuery(name = "Productos.findByStock", query = "SELECT p FROM Productos p WHERE p.stock = :stock"),
    //query para buscar por categoria
    @NamedQuery(name = "Productos.findByCategoria", query = "SELECT p FROM Productos p WHERE p.idTipoProducto.nomCategoria = :nomCategoria")
})

public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdProducto")
    private Integer idProducto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioSinIVA")
    private BigDecimal precioSinIVA;
    @Column(name = "tipoIVA")
    private String tipoIVA;
    @Column(name = "stock")
    private Integer stock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productos")
    private Collection<Detalletickets> detalleticketsCollection;
    @JoinColumn(name = "IdTipoProducto", referencedColumnName = "IdTipoProducto")
    @ManyToOne
    private Tipoproducto idTipoProducto;

    public Productos() {
    }

    public Productos(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Productos(Integer idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(BigDecimal precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public String getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(String tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Collection<Detalletickets> getDetalleticketsCollection() {
        return detalleticketsCollection;
    }

    public void setDetalleticketsCollection(Collection<Detalletickets> detalleticketsCollection) {
        this.detalleticketsCollection = detalleticketsCollection;
    }

    public Tipoproducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Tipoproducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Productos[ idProducto=" + idProducto + " ]";
    }

}
