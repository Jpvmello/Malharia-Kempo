/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.dao.EstadoDao;
import model.pojo.Estado;

/**
 *
 * @author JeanPablo
 */
public class MalhariaKempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexao = null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Malharia_KempoPU");
        EntityManager em = emf.createEntityManager();
        EstadoDao dao = new EstadoDao ();
        
        //try {
            //conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/malharia_kempo","root",/*COLOCAR SENHA*/"j1p2v3m4");
            //if (conexao != null) {
              //  System.out.println("Conectado!");
                
                /*dao.salvar(em, new Estado ("AC", "Acre"));
                dao.salvar(em, new Estado ("AL", "Alagoas"));
                dao.salvar(em, new Estado ("AP", "Amapá"));
                dao.salvar(em, new Estado ("AM", "Amazonas"));
                dao.salvar(em, new Estado ("BA", "Bahia"));
                dao.salvar(em, new Estado ("CE", "Ceará"));
                dao.salvar(em, new Estado ("DF", "Distrito Federal"));
                dao.salvar(em, new Estado ("GO", "Goiás"));
                dao.salvar(em, new Estado ("MA", "Maranhão"));
                dao.salvar(em, new Estado ("MT", "Mato Grosso"));
                dao.salvar(em, new Estado ("MS", "Mato Grosso do Sul"));
                dao.salvar(em, new Estado ("MG", "Minas Gerais"));
                dao.salvar(em, new Estado ("PA", "Pará"));
                dao.salvar(em, new Estado ("PB", "Paraíba"));
                dao.salvar(em, new Estado ("PR", "Paraná"));
                dao.salvar(em, new Estado ("PE", "Pernambuco"));
                dao.salvar(em, new Estado ("PI", "Piauí"));
                dao.salvar(em, new Estado ("RJ", "Rio de Janeiro"));
                dao.salvar(em, new Estado ("RN", "Rio Grande do Norte"));
                dao.salvar(em, new Estado ("RS", "Rio Grande do Sul"));
                dao.salvar(em, new Estado ("RO", "Rondônia"));
                dao.salvar(em, new Estado ("RR", "Roraima"));
                dao.salvar(em, new Estado ("SC", "Santa Catarina"));
                dao.salvar(em, new Estado ("SP", "São Paulo"));
                dao.salvar(em, new Estado ("SE", "Sergipe"));
                dao.salvar(em, new Estado ("TO", "Tocantins"));*/
                
                List<Estado> listaEstados = dao.buscarTodos(em);
                for(Estado e : listaEstados){
                    System.out.println(e.toString());}
            }
        //} catch (SQLException e) {
          //  System.out.println("Não conectado!");
        //}
        
        
    //}
    
}
