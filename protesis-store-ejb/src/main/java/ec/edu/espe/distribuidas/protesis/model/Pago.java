/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.model;

import ec.edu.espe.distribuidas.protesis.enums.TipoPagoEnum;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author
 */
@Entity
@Table(name = "PAGO")
public class Pago implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_PAGO", nullable = false)
    private Integer codPago;
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO", length = 3, nullable = false)
    private TipoPagoEnum tipo;

    public Pago() {
    }

    public Pago(Integer codPago) {
        this.codPago = codPago;
    }

    public Integer getCodPago() {
        return codPago;
    }

    public void setCodPago(Integer codPago) {
        this.codPago = codPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoPagoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagoEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pago{" + "codPago=" + codPago + ", descripcion=" + descripcion + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.codPago);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pago other = (Pago) obj;
        if (!Objects.equals(this.codPago, other.codPago)) {
            return false;
        }
        return true;
    }
    
}
