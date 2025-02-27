/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author clara
 */
@Entity
@Table(name = "tipoproducto")
@NamedQueries({
    @NamedQuery(name = "Tipoproducto.findAll", query = "SELECT t FROM Tipoproducto t"),
    @NamedQuery(name = "Tipoproducto.findByIdTipoProducto", query = "SELECT t FROM Tipoproducto t WHERE t.idTipoProducto = :idTipoProducto"),
    @NamedQuery(name = "Tipoproducto.findByNomTipoProducto", query = "SELECT t FROM Tipoproducto t WHERE t.nomTipoProducto = :nomTipoProducto"),
    @NamedQuery(name = "Tipoproducto.findByNomCategoria", query = "SELECT t FROM Tipoproducto t WHERE t.nomCategoria = :nomCategoria")})
public class Tipoproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTipoProducto")
    private Integer idTipoProducto;
    @Column(name = "nomTipoProducto")
    private String nomTipoProducto;
    @Basic(optional = false)
    @Column(name = "nomCategoria")
    private String nomCategoria;
    /*nos encontramos con una relación unidireccional entre productos y tipoproductos
    que se unen por la fk de productos, lo que permite acceder a estos tipos desde
    la clase producto*/
    @OneToMany(mappedBy = "idTipoProducto")
    private Collection<Productos> productosCollection;

    public Tipoproducto() {
    }

    public Tipoproducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public Tipoproducto(Integer idTipoProducto, String nomCategoria) {
        this.idTipoProducto = idTipoProducto;
        this.nomCategoria = nomCategoria;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getNomTipoProducto() {
        return nomTipoProducto;
    }

    public void setNomTipoProducto(String nomTipoProducto) {
        this.nomTipoProducto = nomTipoProducto;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProducto != null ? idTipoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproducto)) {
            return false;
        }
        Tipoproducto other = (Tipoproducto) object;
        if ((this.idTipoProducto == null && other.idTipoProducto != null) || (this.idTipoProducto != null && !this.idTipoProducto.equals(other.idTipoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Tipoproducto[ idTipoProducto=" + idTipoProducto + " ]";
    }
    
}
