/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.dao;

import ec.edu.espe.distribuidas.protesis.model.Categoria;
import ec.edu.espe.distribuidas.protesis.model.Pago;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author js_cm
 */
@Stateless
public class PagoFacade extends AbstractFacade<Pago> {
    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_protesis-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PagoFacade() {
        super(Pago.class);
    }
    
    public List<Pago> findByCodigo(Integer codPago) {
        Query qry = this.em.createQuery("SELECT obj FROM Pago obj WHERE obj.codPago =?1");
        qry.setParameter(1, codPago);
        return qry.getResultList();
    }
}
