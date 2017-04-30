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
import model.pojo.Pedido;

/**
 *
 * @author JeanPablo
 */
public class PedidoDao implements Dao<Pedido, Short> {
    //private static List<Pedido> listaPedido = new ArrayList<>();
    private static PedidoDao instancia = null;
    
    public static PedidoDao getInstancia(){
        if(PedidoDao.instancia == null)
            instancia = new PedidoDao();
        return instancia;
    }

    @Override
    public Boolean salvar (EntityManager em, Pedido pedido) {
        try {
            em.getTransaction().begin();
            em.persist(pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
    }

    @Override
    public Boolean atualizar (EntityManager em, Pedido pedido) {
        try {
            em.getTransaction().begin();
            em.merge(pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
    }
    
    @Override
    public Boolean remover (EntityManager em, Pedido pedido) {
        try {
            em.getTransaction().begin();
            em.remove(pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback(); //Para recuperar os dados em caso de falha na transação
            return false;
        }
        return true;
    }
    
    @Override
    public Pedido buscar(EntityManager em, Short id) {
        return em.find(Pedido.class, id);
    }

    @Override
    public List<Pedido> buscarTodos (EntityManager em) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Pedido.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
    
    
}
