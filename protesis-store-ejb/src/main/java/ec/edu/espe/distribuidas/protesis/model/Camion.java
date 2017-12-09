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
@Table(name = "camion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camion.findAll", query = "SELECT c FROM Camion c"),
    @NamedQuery(name = "Camion.findByCodCamion", query = "SELECT c FROM Camion c WHERE c.codCamion = :codCamion"),
    @NamedQuery(name = "Camion.findByPlaca", query = "SELECT c FROM Camion c WHERE c.placa = :placa"),
    @NamedQuery(name = "Camion.findByModelo", query = "SELECT c FROM Camion c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Camion.findByColor", query = "SELECT c FROM Camion c WHERE c.color = :color"),
    @NamedQuery(name = "Camion.findByMarca", query = "SELECT c FROM Camion c WHERE c.marca = :marca")})
public class Camion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CAMION", nullable = false)
    private Integer codCamion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PLACA", nullable = false, length = 20)
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MODELO", nullable = false, length = 100)
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "COLOR", nullable = false, length = 100)
    private String color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MARCA", nullable = false, length = 100)
    private String marca;
    @JoinColumn(name = "COD_CONDUCTOR", referencedColumnName = "COD_CONDUCTOR")
    @ManyToOne(fetch = FetchType.EAGER)
    private Conductor codConductor;
    @OneToMany(mappedBy = "codCamion", fetch = FetchType.EAGER)
    private List<Entrega> entregaList;

    public Camion() {
    }

    public Camion(Integer codCamion) {
        this.codCamion = codCamion;
    }

    public Camion(Integer codCamion, String placa, String modelo, String color, String marca) {
        this.codCamion = codCamion;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
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

    public Conductor getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(Conductor codConductor) {
        this.codConductor = codConductor;
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
