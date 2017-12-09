/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByCodVenta", query = "SELECT v FROM Venta v WHERE v.codVenta = :codVenta"),
    @NamedQuery(name = "Venta.findByCodUsuario", query = "SELECT v FROM Venta v WHERE v.codUsuario = :codUsuario"),
    @NamedQuery(name = "Venta.findByCodProducto", query = "SELECT v FROM Venta v WHERE v.codProducto = :codProducto"),
    @NamedQuery(name = "Venta.findByFechaEmision", query = "SELECT v FROM Venta v WHERE v.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Venta.findByCantidad", query = "SELECT v FROM Venta v WHERE v.cantidad = :cantidad"),
    @NamedQuery(name = "Venta.findByValorFinal", query = "SELECT v FROM Venta v WHERE v.valorFinal = :valorFinal")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codVenta;
    @Column(name = "COD_USUARIO")
    private Integer codUsuario;
    @Column(name = "COD_PRODUCTO")
    private Integer codProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_EMISION", nullable = false)
    private int fechaEmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_FINAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorFinal;
    @JoinColumn(name = "COD_CANAL", referencedColumnName = "COD_CANAL")
    @ManyToOne(fetch = FetchType.EAGER)
    private Canal codCanal;
    @OneToMany(mappedBy = "codVenta", fetch = FetchType.EAGER)
    private List<Entrega> entregaList;

    public Venta() {
    }

    public Venta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Venta(Integer codVenta, int fechaEmision, int cantidad, BigDecimal valorFinal) {
        this.codVenta = codVenta;
        this.fechaEmision = fechaEmision;
        this.cantidad = cantidad;
        this.valorFinal = valorFinal;
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
