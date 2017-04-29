/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.pojo.Pedido;

/**
 *
 * @author JeanPablo
 */
public class PedidoDao implements Dao<Pedido> {
    private static List<Pedido> listaPedido = new ArrayList<>();
    private static PedidoDao instancia = null;
    
    public static PedidoDao getInstancia(){
        if(PedidoDao.instancia == null)
            instancia = new PedidoDao();
        return instancia;
    }
    
    
}
