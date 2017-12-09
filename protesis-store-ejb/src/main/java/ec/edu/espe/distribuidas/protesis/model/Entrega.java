/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e"),
    @NamedQuery(name = "Entrega.findByCodEntrega", query = "SELECT e FROM Entrega e WHERE e.codEntrega = :codEntrega"),
    @NamedQuery(name = "Entrega.findByDescripcion", query = "SELECT e FROM Entrega e WHERE e.descripcion = :descripcion")})
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_ENTREGA", nullable = false)
    private Integer codEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA")
    @ManyToOne(fetch = FetchType.EAGER)
    private Venta codVenta;
    @JoinColumn(name = "COD_CAMION", referencedColumnName = "COD_CAMION")
    @ManyToOne(fetch = FetchType.EAGER)
    private Camion codCamion;

    public Entrega() {
    }

    public Entrega(Integer codEntrega) {
        this.codEntrega = codEntrega;
    }

    public Entrega(Integer codEntrega, String descripcion) {
        this.codEntrega = codEntrega;
        this.descripcion = descripcion;
    }

    public Integer getCodEntrega() {
        return codEntrega;
    }

    public void setCodEntrega(Integer codEntrega) {
        this.codEntrega = codEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Venta getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Venta codVenta) {
        this.codVenta = codVenta;
    }

    public Camion getCodCamion() {
        return codCamion;
    }

    public void setCodCamion(Camion codCamion) {
        this.codCamion = codCamion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEntrega != null ? codEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.codEntrega == null && other.codEntrega != null) || (this.codEntrega != null && !this.codEntrega.equals(other.codEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Entrega[ codEntrega=" + codEntrega + " ]";
    }
    
}
