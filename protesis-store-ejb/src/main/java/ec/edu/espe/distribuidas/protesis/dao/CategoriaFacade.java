/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.dao;

import ec.edu.espe.distribuidas.protesis.model.Categoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author js_cm
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_protesis-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }
    
}
