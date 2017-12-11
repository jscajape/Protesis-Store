/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.enums;

/**
 *
 * @author Labs-DECC
 */
public enum TipoPagoEnum {
    EFE("EFECTIVO"),
    TAR("TARJETA");

    
    private String texto;

    private TipoPagoEnum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
