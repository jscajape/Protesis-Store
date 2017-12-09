/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c"),
    @NamedQuery(name = "Conductor.findByCodConductor", query = "SELECT c FROM Conductor c WHERE c.codConductor = :codConductor"),
    @NamedQuery(name = "Conductor.findByNombre", query = "SELECT c FROM Conductor c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Conductor.findByApellido", query = "SELECT c FROM Conductor c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Conductor.findByTipoIdentificion", query = "SELECT c FROM Conductor c WHERE c.tipoIdentificion = :tipoIdentificion"),
    @NamedQuery(name = "Conductor.findByIdentificacion", query = "SELECT c FROM Conductor c WHERE c.identificacion = :identificacion"),
    @NamedQuery(name = "Conductor.findByFechaNacimiento", query = "SELECT c FROM Conductor c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Conductor.findByLicencia", query = "SELECT c FROM Conductor c WHERE c.licencia = :licencia")})
public class Conductor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CONDUCTOR", nullable = false)
    private Integer codConductor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_IDENTIFICION", nullable = false, length = 3)
    private String tipoIdentificion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENTIFICACION", nullable = false)
    private long identificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LICENCIA", nullable = false)
    private BigInteger licencia;
    @OneToMany(mappedBy = "codConductor", fetch = FetchType.EAGER)
    private List<Camion> camionList;

    public Conductor() {
    }

    public Conductor(Integer codConductor) {
        this.codConductor = codConductor;
    }

    public Conductor(Integer codConductor, String nombre, String apellido, String tipoIdentificion, long identificacion, Date fechaNacimiento, BigInteger licencia) {
        this.codConductor = codConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificion = tipoIdentificion;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.licencia = licencia;
    }

    public Integer getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(Integer codConductor) {
        this.codConductor = codConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoIdentificion() {
        return tipoIdentificion;
    }

    public void setTipoIdentificion(String tipoIdentificion) {
        this.tipoIdentificion = tipoIdentificion;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigInteger getLicencia() {
        return licencia;
    }

    public void setLicencia(BigInteger licencia) {
        this.licencia = licencia;
    }

    @XmlTransient
    public List<Camion> getCamionList() {
        return camionList;
    }

    public void setCamionList(List<Camion> camionList) {
        this.camionList = camionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codConductor != null ? codConductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.codConductor == null && other.codConductor != null) || (this.codConductor != null && !this.codConductor.equals(other.codConductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Conductor[ codConductor=" + codConductor + " ]";
    }
    
}
