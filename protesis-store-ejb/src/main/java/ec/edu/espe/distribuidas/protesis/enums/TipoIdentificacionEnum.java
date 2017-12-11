/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.enums;

/**
 *
 * @author
 */
public enum TipoIdentificacionEnum {
    
    CED("CEDULA"),
    RUC("RUC"),
    PAS("PASAPORTE");
    
    private String texto;
    
    private TipoIdentificacionEnum(String texto){
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
