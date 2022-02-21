/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
       super(cliente);
   }
   @Override
   public void imprimirExtrato(){
       System.out.println("=== Extrato Conta Poupança ===");
       super.imprimirInfosComuns();
   }
}