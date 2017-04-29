/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author JeanPablo
 * @param <T>
 */
public interface Dao<T, U> {
    void salvar (EntityManager em, T objeto) throws Exception;
    Boolean atualizar (EntityManager em, T objeto) throws Exception;
    void remover (EntityManager em, T objeto) throws Exception;
    T buscar (EntityManager em, U id);
    List<T> buscarTodos (EntityManager em);   
}
