/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.pojo.Cliente;

/**
 *
 * @author JeanPablo
 */
public class ClienteDao implements Dao<Cliente>{
    private static List<Cliente> listaCliente = new ArrayList<>();
    private static ClienteDao instancia = null;
    
    public static ClienteDao getInstancia(){
        if(ClienteDao.instancia == null)
            instancia = new ClienteDao();
        return instancia;
    }
    
    
}
