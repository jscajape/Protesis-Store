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
import javax.swing.plaf.synth.Region;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "PROVINCIA")

public class Provincia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PROVINCIA", nullable = false)
    private Integer codProvincia;
    @Column(name = "COD_REGION", nullable = false)
    private Integer codRegion;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @JoinColumn(name = "COD_REGION", referencedColumnName = "COD_REGION", insertable = false, updatable = false)
    @ManyToOne
    private Region Region;

    public Provincia() {
    }

    public Provincia(Integer codProvincia) {
        this.codProvincia = codProvincia;
    }


    public Integer getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(Integer codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(Integer codRegion) {
        this.codRegion = codRegion;
    }

    public Region getRegion() {
        return Region;
    }

    public void setRegion(Region Region) {
        this.Region = Region;
    }





    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProvincia != null ? codProvincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.codProvincia == null && other.codProvincia != null) || (this.codProvincia != null && !this.codProvincia.equals(other.codProvincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Provincia[ codProvincia=" + codProvincia + " ]";
    }
    
}
