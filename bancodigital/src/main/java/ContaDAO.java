
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
public class ContaDAO {
     ArrayList<Conta> contas = new ArrayList<Conta>();
     public void adicionar(Conta c){
         this.contas.add(c);
     }
     public void remover(Conta c){
         this.contas.remove(c);
     }
     public ArrayList<Conta> listar(){
         return  this.contas;
     }
}
