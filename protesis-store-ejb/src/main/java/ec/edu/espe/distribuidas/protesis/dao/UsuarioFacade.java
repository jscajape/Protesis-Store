/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.protesis.dao;

import ec.edu.espe.distribuidas.protesis.model.Usuario;
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
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "ec.edu.espe.proyecto.protesis_protesis-store-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public List<Usuario> findByNombreApellido(String nombre, String apellido) {
        Query qry = this.em.createQuery("SELECT obj FROM Usuario obj WHERE obj.nombre =?1 AND obj.apellido = ?2");
        qry.setParameter(1, nombre);
        qry.setParameter(2, apellido);
        return qry.getResultList();
    }
    
     public List<Usuario> findByIdentificacion(Integer identificacion) {
        Query qry = this.em.createQuery("SELECT obj FROM Usuario obj WHERE obj.identificacion =?1");
        qry.setParameter(1, identificacion);
        return qry.getResultList();
    }
}
