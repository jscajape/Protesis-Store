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
@Table(name = "REGION")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_REGION", nullable = false)
    private Integer codRegion;
    @Column(name = "COD_PAIS", nullable = false)
    private Integer codPais;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @JoinColumn(name = "COD_PAIS", referencedColumnName = "COD_PAIS", insertable = false, updatable = false)
    @ManyToOne
    private Pais Pais;

    public Region() {
    }

    public Region(Integer codRegion) {
        this.codRegion = codRegion;
    }


    public Integer getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(Integer codRegion) {
        this.codRegion = codRegion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais Pais) {
        this.Pais = Pais;
    }





    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRegion != null ? codRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.codRegion == null && other.codRegion != null) || (this.codRegion != null && !this.codRegion.equals(other.codRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Region[ codRegion=" + codRegion + " ]";
    }
    
}
