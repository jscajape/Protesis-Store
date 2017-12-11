/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "COMPRA")
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_COMPRA", nullable = false)
    private Integer codCompra;
    @Column(name = "FECHA_COMPRA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Column(name = "CANTIDAD", nullable = false)
    private int cantidad;
    @Column(name = "PRECIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal precio;
    @Column(name = "COD_PRODUCTO", nullable = false)
    private Integer codProducto;
    @Column(name = "COD_PROVEEDOR", nullable = false)
    private Integer codProveedor;
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", insertable = false, updatable = false)
    @ManyToOne
    private Producto Producto;
    @JoinColumn(name = "COD_PROVEEDOR", referencedColumnName = "COD_PROVEEDOR", insertable = false, updatable = false)
    @ManyToOne
    private Proveedor Proveedor;

    public Compra() {
    }

    public Compra(Integer codCompra) {
        this.codCompra = codCompra;
    }


    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }

    public void setProveedor(Proveedor Proveedor) {
        this.Proveedor = Proveedor;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCompra != null ? codCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codCompra == null && other.codCompra != null) || (this.codCompra != null && !this.codCompra.equals(other.codCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Compra[ codCompra=" + codCompra + " ]";
    }
    
}
