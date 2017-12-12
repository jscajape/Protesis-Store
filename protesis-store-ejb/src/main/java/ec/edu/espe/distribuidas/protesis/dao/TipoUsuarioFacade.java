/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.dao;

import ec.edu.espe.distribuidas.protesis.model.Canal;
import ec.edu.espe.distribuidas.protesis.model.TipoUsuario;
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
public class TipoUsuarioFacade extends AbstractFacade<TipoUsuario> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_protesis-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoUsuarioFacade() {
        super(TipoUsuario.class);
    }
    
    public List<TipoUsuario> findByCodigo(Integer codTipoUsuario) {
        Query qry = this.em.createQuery("SELECT obj FROM TipoUsuario obj WHERE obj.codTipoUsuario =?1");
        qry.setParameter(1, codTipoUsuario);
        return qry.getResultList();
    }
    
}
