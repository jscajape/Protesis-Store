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
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "CATEGORIA")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_CATEGORIA", nullable = false)
    private Integer codCategoria;
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

    public Categoria() {
    }

    public Categoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public Categoria(Integer codCategoria, String nombre) {
        this.codCategoria = codCategoria;
        this.nombre = nombre;
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCategoria != null ? codCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.codCategoria == null && other.codCategoria != null) || (this.codCategoria != null && !this.codCategoria.equals(other.codCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Categoria[ codCategoria=" + codCategoria + " ]";
    }
    
}
