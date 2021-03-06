/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.dao;

import ec.edu.espe.distribuidas.protesis.model.SubCategoria;
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
public class SubCategoriaFacade extends AbstractFacade<SubCategoria> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_protesis-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubCategoriaFacade() {
        super(SubCategoria.class);
    }
    
    
    public List<SubCategoria> findByDescripcion(String nombre) {
        Query qry = this.em.createQuery("SELECT obj FROM SubCategoria obj WHERE obj.descripcion=?1");
        qry.setParameter(1, nombre);
        return qry.getResultList();
    }
    
    
}
