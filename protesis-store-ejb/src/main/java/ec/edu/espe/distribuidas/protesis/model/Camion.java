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
@Table(name = "CAMION")
public class Camion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_CAMION", nullable = false)
    private Integer codCamion;
    @Column(name = "COD_CONDUCTOR", nullable = false)
    private Integer codConductor;
    @Column(name = "PLACA", nullable = false, length = 20)
    private String placa;
    @Column(name = "MODELO", nullable = false, length = 100)
    private String modelo;
    @Column(name = "COLOR", nullable = false, length = 100)
    private String color;
    @Column(name = "MARCA", nullable = false, length = 100)
    private String marca;
    @JoinColumn(name = "COD_CONDUCTOR", referencedColumnName = "COD_CONDUCTOR", insertable = false, updatable = false)
    @ManyToOne
    private Conductor Conductor;

    public Camion() {
    }

    public Camion(Integer codCamion) {
        this.codCamion = codCamion;
    }

    public Integer getCodCamion() {
        return codCamion;
    }

    public void setCodCamion(Integer codCamion) {
        this.codCamion = codCamion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Conductor getConductor() {
        return Conductor;
    }

    public void setConductor(Conductor Conductor) {
        this.Conductor = Conductor;
    }

    public Integer getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(Integer codConductor) {
        this.codConductor = codConductor;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCamion != null ? codCamion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camion)) {
            return false;
        }
        Camion other = (Camion) object;
        if ((this.codCamion == null && other.codCamion != null) || (this.codCamion != null && !this.codCamion.equals(other.codCamion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Camion[ codCamion=" + codCamion + " ]";
    }
    
}
