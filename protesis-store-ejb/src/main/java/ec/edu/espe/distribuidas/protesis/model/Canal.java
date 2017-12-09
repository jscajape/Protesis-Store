/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "canal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canal.findAll", query = "SELECT c FROM Canal c"),
    @NamedQuery(name = "Canal.findByCodCanal", query = "SELECT c FROM Canal c WHERE c.codCanal = :codCanal"),
    @NamedQuery(name = "Canal.findByDescripcion", query = "SELECT c FROM Canal c WHERE c.descripcion = :descripcion")})
public class Canal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CANAL", nullable = false)
    private Integer codCanal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    @OneToMany(mappedBy = "codCanal", fetch = FetchType.EAGER)
    private List<Venta> ventaList;

    public Canal() {
    }

    public Canal(Integer codCanal) {
        this.codCanal = codCanal;
    }

    public Canal(Integer codCanal, String descripcion) {
        this.codCanal = codCanal;
        this.descripcion = descripcion;
    }

    public Integer getCodCanal() {
        return codCanal;
    }

    public void setCodCanal(Integer codCanal) {
        this.codCanal = codCanal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCanal != null ? codCanal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canal)) {
            return false;
        }
        Canal other = (Canal) object;
        if ((this.codCanal == null && other.codCanal != null) || (this.codCanal != null && !this.codCanal.equals(other.codCanal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Canal[ codCanal=" + codCanal + " ]";
    }
    
}
