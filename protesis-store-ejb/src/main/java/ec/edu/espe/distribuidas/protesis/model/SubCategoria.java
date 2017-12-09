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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "sub_categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategoria.findAll", query = "SELECT s FROM SubCategoria s"),
    @NamedQuery(name = "SubCategoria.findByCodSubcategoria", query = "SELECT s FROM SubCategoria s WHERE s.codSubcategoria = :codSubcategoria"),
    @NamedQuery(name = "SubCategoria.findByDescripcion", query = "SELECT s FROM SubCategoria s WHERE s.descripcion = :descripcion")})
public class SubCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_SUBCATEGORIA", nullable = false)
    private Integer codSubcategoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    @OneToMany(mappedBy = "codSubcategoria", fetch = FetchType.EAGER)
    private List<Producto> productoList;
    @JoinColumn(name = "COD_CATEGORIA", referencedColumnName = "COD_CATEGORIA")
    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria codCategoria;

    public SubCategoria() {
    }

    public SubCategoria(Integer codSubcategoria) {
        this.codSubcategoria = codSubcategoria;
    }

    public SubCategoria(Integer codSubcategoria, String descripcion) {
        this.codSubcategoria = codSubcategoria;
        this.descripcion = descripcion;
    }

    public Integer getCodSubcategoria() {
        return codSubcategoria;
    }

    public void setCodSubcategoria(Integer codSubcategoria) {
        this.codSubcategoria = codSubcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public Categoria getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Categoria codCategoria) {
        this.codCategoria = codCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSubcategoria != null ? codSubcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategoria)) {
            return false;
        }
        SubCategoria other = (SubCategoria) object;
        if ((this.codSubcategoria == null && other.codSubcategoria != null) || (this.codSubcategoria != null && !this.codSubcategoria.equals(other.codSubcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.SubCategoria[ codSubcategoria=" + codSubcategoria + " ]";
    }
    
}
