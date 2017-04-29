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
    private static List<Pedido> listaPedido = new ArrayList<>();
    private static PedidoDao instancia = null;
    
    public static PedidoDao getInstancia(){
        if(PedidoDao.instancia == null)
            instancia = new PedidoDao();
        return instancia;
    }

    @Override
    public void salvar (EntityManager em, Pedido pedido) {
        em.getTransaction().begin();
        em.persist(pedido);
        em.getTransaction().commit();
    }

    @Override
    public Boolean atualizar (EntityManager em, Pedido pedido) {
        try {
            em.getTransaction().begin();
            pedido = em.merge(pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = pedido.getIdPedido();
                if (buscar(em, id) == null) {
                    return false;
                }
            }
            throw ex;
        }
        return true;
    }
    
    @Override
    public void remover (EntityManager em, Pedido pedido) {
        em.getTransaction().begin();
        em.remove(pedido);
        em.getTransaction().commit();
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
