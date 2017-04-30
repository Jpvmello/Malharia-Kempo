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
    //private static List<Estado> listaEstado = new ArrayList<>();
    private static EstadoDao instancia = null;
    
    public static EstadoDao getInstancia(){
        if(EstadoDao.instancia == null)
            instancia = new EstadoDao();
        return instancia;
    }
    
    @Override
    public Boolean salvar (EntityManager em, Estado estado) {
        try {
            em.getTransaction().begin();
            em.persist(estado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
    }

    @Override
    public Boolean atualizar (EntityManager em, Estado estado) {
        try {
            em.getTransaction().begin();
            em.merge(estado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
    }
    
    @Override
    public Boolean remover (EntityManager em, Estado estado) {
        try {
            em.getTransaction().begin();
            em.remove(estado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
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
