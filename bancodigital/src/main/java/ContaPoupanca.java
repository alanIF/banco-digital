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
     private static int SEQUENCIAL=0;

    public ContaPoupanca(){
        super.numero= SEQUENCIAL++; 
    }
}
