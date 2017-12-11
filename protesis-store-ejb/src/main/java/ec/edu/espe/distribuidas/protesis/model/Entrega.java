/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "ENTREGA")
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_ENTREGA", nullable = false)
    private Integer codEntrega;
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA", insertable = false, updatable = false)
    @ManyToOne
    private Venta codVenta;
    @JoinColumn(name = "COD_CAMION", referencedColumnName = "COD_CAMION", insertable = false, updatable = false)
    @ManyToOne
    private Camion codCamion;

    public Entrega() {
    }

    public Entrega(Integer codEntrega) {
        this.codEntrega = codEntrega;
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
