/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "venta")

public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codVenta;
    @Column(name = "COD_USUARIO")
    private Integer codUsuario;
    @Column(name = "COD_PRODUCTO")
    private Integer codProducto;
    @Column(name = "FECHA_EMISION", nullable = false)
    private int fechaEmision;
    @Column(name = "CANTIDAD", nullable = false)
    private int cantidad;
    @Column(name = "VALOR_FINAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorFinal;
    @JoinColumn(name = "COD_CANAL", referencedColumnName = "COD_CANAL", insertable = false, updatable = false)
    @ManyToOne
    private Canal codCanal;
    
    @JoinColumn(name = "COD_PAGO", referencedColumnName = "COD_PAGO", insertable = false, updatable = false)
    @ManyToOne
    private Pago codPago;
    
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", insertable = false, updatable = false)
    @ManyToOne
    private Usuario codUsuario;

    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", insertable = false, updatable = false)
    @ManyToOne
    private Producto codProducto;
    
    public Pago getCodPago() {
        return codPago;
    }

    public void setCodPago(Pago codPago) {
        this.codPago = codPago;
    }

    public Venta() {
    }

    public Venta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Integer getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public int getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(int fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Canal getCodCanal() {
        return codCanal;
    }

    public void setCodCanal(Canal codCanal) {
        this.codCanal = codCanal;
    }

    @XmlTransient
    public List<Entrega> getEntregaList() {
        return entregaList;
    }

    public void setEntregaList(List<Entrega> entregaList) {
        this.entregaList = entregaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVenta != null ? codVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codVenta == null && other.codVenta != null) || (this.codVenta != null && !this.codVenta.equals(other.codVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Venta[ codVenta=" + codVenta + " ]";
    }
    
}
