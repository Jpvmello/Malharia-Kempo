/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import model.pojo.Estado;

/**
 *
 * @author JeanPablo
 */
public class EstadoDao implements Dao<Estado, String> {
    private static List<Estado> listaEstado = new ArrayList<>();
    private static EstadoDao instancia = null;
    
    public static EstadoDao getInstancia(){
        if(EstadoDao.instancia == null)
            instancia = new EstadoDao();
        return instancia;
    }
    
    @Override
    public void salvar (EntityManager em, Estado estado) {
        em.getTransaction().begin();
        em.persist(estado);
        em.getTransaction().commit();
    }

    @Override
    public Boolean atualizar (EntityManager em, Estado estado) {
        try {
            em.getTransaction().begin();
            estado = em.merge(estado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = estado.getCodigoEstado();
                if (buscar(em, id) == null) {
                    return false;
                }
            }
            throw ex;
        }
        return true;
    }
    
    @Override
    public void remover (EntityManager em, Estado estado) {
        em.getTransaction().begin();
        em.remove(estado);
        em.getTransaction().commit();
    }
    
    @Override
    public Estado buscar(EntityManager em, String id) {
        return em.find(Estado.class, id);
    }

    @Override
    public List<Estado> buscarTodos (EntityManager em) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Estado.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}
