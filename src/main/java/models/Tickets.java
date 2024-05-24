/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author clara
 */
@Entity
@Table(name = "tickets")
@NamedQueries({
    @NamedQuery(name = "Tickets.findAll", query = "SELECT t FROM Tickets t"),
    @NamedQuery(name = "Tickets.findByIdTicket", query = "SELECT t FROM Tickets t WHERE t.idTicket = :idTicket"),
    @NamedQuery(name = "Tickets.findByNumeroPedido", query = "SELECT t FROM Tickets t WHERE t.numeroPedido = :numeroPedido"),
    @NamedQuery(name = "Tickets.findByCodTransaccion", query = "SELECT t FROM Tickets t WHERE t.codTransaccion = :codTransaccion"),
    @NamedQuery(name = "Tickets.findByFechaOperacion", query = "SELECT t FROM Tickets t WHERE t.fechaOperacion = :fechaOperacion"),
    @NamedQuery(name = "Tickets.findByHoraOperacion", query = "SELECT t FROM Tickets t WHERE t.horaOperacion = :horaOperacion"),
    @NamedQuery(name = "Tickets.findByImporteTotal", query = "SELECT t FROM Tickets t WHERE t.importeTotal = :importeTotal")})
public class Tickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTicket")
    private Integer idTicket;
    @Column(name = "numeroPedido")
    private Integer numeroPedido;
    @Basic(optional = false)
    @Column(name = "codTransaccion")
    private String codTransaccion;
    @Column(name = "fechaOperacion")
    @Temporal(TemporalType.DATE)
    private Date fechaOperacion;
    @Column(name = "horaOperacion")
    @Temporal(TemporalType.TIME)
    private Date horaOperacion;
    @Column(name = "importeTotal")
    private BigDecimal importeTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tickets")
    private Collection<Detalletickets> detalleticketsCollection= new ArrayList<>();
    @JoinColumn(name = "IdTpv", referencedColumnName = "IdTpv")
    @ManyToOne
    private Tpv idTpv;

    public Tickets() {
    }

    public Tickets(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Tickets(Integer idTicket, String codTransaccion) {
        this.idTicket = idTicket;
        this.codTransaccion = codTransaccion;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCodTransaccion() {
        return codTransaccion;
    }

    public void setCodTransaccion(String codTransaccion) {
        this.codTransaccion = codTransaccion;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public Date getHoraOperacion() {
        return horaOperacion;
    }

    public void setHoraOperacion(Date horaOperacion) {
        this.horaOperacion = horaOperacion;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Collection<Detalletickets> getDetalleticketsCollection() {
        return detalleticketsCollection;
    }

    public void setDetalleticketsCollection(Collection<Detalletickets> detalleticketsCollection) {
        this.detalleticketsCollection = detalleticketsCollection;
    }

    public Tpv getIdTpv() {
        return idTpv;
    }

    public void setIdTpv(Tpv idTpv) {
        this.idTpv = idTpv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tickets)) {
            return false;
        }
        Tickets other = (Tickets) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ " + idTicket + " ]";
    }
    
}
