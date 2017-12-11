/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
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
@Table(name = "CIUDAD")
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_CIUDAD", nullable = false)
    private Integer codCiudad;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @JoinColumn(name = "COD_PROVINCIA", referencedColumnName = "COD_PROVINCIA", insertable = false, updatable = false)
    @ManyToOne
    private Provincia codProvincia;

    public Ciudad() {
    }

    public Ciudad(Integer codCiudad) {
        this.codCiudad = codCiudad;
    }


    public Integer getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(Integer codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(Provincia codProvincia) {
        this.codProvincia = codProvincia;
    }

    @XmlTransient
    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCiudad != null ? codCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.codCiudad == null && other.codCiudad != null) || (this.codCiudad != null && !this.codCiudad.equals(other.codCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Ciudad[ codCiudad=" + codCiudad + " ]";
    }
    
}
