/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import ec.edu.espe.distribuidas.protesis.enums.TipoIdentificacionEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "PROVEEDOR")

public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PROVEEDOR", nullable = false)
    private Integer codProveedor;
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO", length = 3, nullable = false)
    private TipoIdentificacionEnum tipo;
    @Column(name = "IDENTIFICACION", nullable = false)
    private long identificacion;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Column(name = "CALLE_PRINCIPAL", nullable = false, length = 100)
    private String callePrincipal;
    @Column(name = "CALLE_SECUNDARIA", nullable = false, length = 100)
    private String calleSecundaria;
    @Column(name = "COD_CIUDAD", nullable = false)
    private Integer codCiudad;
    @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", insertable = false, updatable = false)
    @ManyToOne
    private Ciudad Ciudad;

    public Proveedor() {
    }

    public Proveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }


    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public TipoIdentificacionEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoIdentificacionEnum tipo) {
        this.tipo = tipo;
    }

 

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public Integer getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(Integer codCiudad) {
        this.codCiudad = codCiudad;
    }

    public Ciudad getCiudad() {
        return Ciudad;
    }

    public void setCiudad(Ciudad Ciudad) {
        this.Ciudad = Ciudad;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProveedor != null ? codProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codProveedor == null && other.codProveedor != null) || (this.codProveedor != null && !this.codProveedor.equals(other.codProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Proveedor[ codProveedor=" + codProveedor + " ]";
    }
    
}
