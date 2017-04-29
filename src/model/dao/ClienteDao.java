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
import model.pojo.Cliente;

/**
 *
 * @author JeanPablo
 */
public class ClienteDao implements Dao<Cliente, Long>{
    private static List<Cliente> listaCliente = new ArrayList<>();
    private static ClienteDao instancia = null;
    
    public static ClienteDao getInstancia(){
        if(ClienteDao.instancia == null)
            instancia = new ClienteDao();
        return instancia;
    }
    
    @Override
    public void salvar (EntityManager em, Cliente cliente) {
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }

    @Override
    public Boolean atualizar (EntityManager em, Cliente cliente) {
        try {
            em.getTransaction().begin();
            cliente = em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cliente.getCadastroPessoa();
                if (buscar(em, id) == null) {
                    return false;
                }
            }
            throw ex;
        }
        return true;
    }
    
    @Override
    public void remover (EntityManager em, Cliente cliente) {
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }
    
    @Override
    public Cliente buscar(EntityManager em, Long id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> buscarTodos (EntityManager em) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cliente.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}
