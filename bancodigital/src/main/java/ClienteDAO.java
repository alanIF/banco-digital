
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ClienteDAO {
     ArrayList<Cliente> clientes = new ArrayList<Cliente>();
     public void adicionar(Cliente c){
         this.clientes.add(c);
     }
     public void remover(Cliente c){
         this.clientes.remove(c);
     }
     public ArrayList<Cliente> listar(){
         return  this.clientes;
     }
     
    
}
