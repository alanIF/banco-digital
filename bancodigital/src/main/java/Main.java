/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String []args){
        Cliente venilton = new Cliente();
	venilton.setNome("Venilton");
		
	Conta cc = new ContaCorrente(venilton);
	Conta poupanca = new ContaPoupanca(venilton);

	cc.depositar(100);
	cc.transferir(100, poupanca);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
        
    }
}
