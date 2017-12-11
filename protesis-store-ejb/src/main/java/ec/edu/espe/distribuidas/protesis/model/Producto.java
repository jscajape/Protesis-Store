/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
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
@Table(name = "PRODUCTO")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PRODUCTO", nullable = false)
    private Integer codProducto;
    @Column(name = "DESCRIPCION", nullable = false, length = 500)
    private String descripcion;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "PRECIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal precio;
    @Column(name = "STOCK", nullable = false)
    private int stock;
    @Basic(optional = false)
    @Column(name = "MARCA", nullable = false, length = 200)
    private String marca;
    @Column(name = "PORCENTAJE_IVA", nullable = false)
    private short porcentajeIva;
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Column(name = "COD_SUBCATEGORIA", nullable = false)
    private Integer codSubCategoria;
    @JoinColumn(name = "COD_SUBCATEGORIA", referencedColumnName = "COD_SUBCATEGORIA", insertable = false, updatable = false)
    @ManyToOne
    private SubCategoria Subcategoria;

    public Producto() {
    }

    public Producto(Integer codProducto) {
        this.codProducto = codProducto;
    }


    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public short getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(short porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Integer getCodSubCategoria() {
        return codSubCategoria;
    }

    public void setCodSubCategoria(Integer codSubCategoria) {
        this.codSubCategoria = codSubCategoria;
    }

    public SubCategoria getSubcategoria() {
        return Subcategoria;
    }

    public void setSubcategoria(SubCategoria Subcategoria) {
        this.Subcategoria = Subcategoria;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProducto != null ? codProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.codProducto == null && other.codProducto != null) || (this.codProducto != null && !this.codProducto.equals(other.codProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Producto[ codProducto=" + codProducto + " ]";
    }
    
}
