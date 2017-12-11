/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import ec.edu.espe.distribuidas.protesis.enums.TipoIdentificacionEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author js_cm
 */
@Entity
@Table(name = "USUARIO")

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codUsuario;
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO", length = 3, nullable = false)
    private TipoIdentificacionEnum tipo;
    @Column(name = "COD_TIPO_USUARIO", nullable = false)
    private Integer codTipoUsuario;
    @Column(name = "COD_Ciudad", nullable = false)
    private Integer codCiudad;
    @Column(name = "IDENTIFICACION", nullable = false)
    private long identificacion;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;
    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "COD_POSTAL", nullable = false)
    private int codPostal;
    @Column(name = "CALLE_PRINCIPAL", nullable = false, length = 100)
    private String callePrincipal;
    @Column(name = "CALLE_SECUNDARIA", nullable = false, length = 100)
    private String calleSecundaria;
    @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_CIUDAD", insertable = false, updatable = false)
    @ManyToOne
    private Ciudad Ciudad;
    @JoinColumn(name = "COD_TIPO_USUARIO", referencedColumnName = "COD_TIPO_USUARIO", insertable = false, updatable = false)
    @ManyToOne
    private TipoUsuario TipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }



    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
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

    public Integer getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(Integer codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
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

    public TipoUsuario getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.protesis.model.Usuario[ codUsuario=" + codUsuario + " ]";
    }
    
}
