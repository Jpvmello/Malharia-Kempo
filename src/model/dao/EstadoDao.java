/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.pojo.Estado;

/**
 *
 * @author JeanPablo
 */
public class EstadoDao implements Dao<Estado> {
    private static List<Estado> listaEstado = new ArrayList<>();
    private static EstadoDao instancia = null;
    
    public static EstadoDao getInstancia(){
        if(EstadoDao.instancia == null)
            instancia = new EstadoDao();
        return instancia;
    }
    
    
}
