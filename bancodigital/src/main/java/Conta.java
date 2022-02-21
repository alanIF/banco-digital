/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Conta implements IConta{
    protected int conta;
    protected int numero;
    protected  double saldo;
    private static int SEQUENCIAL=0;
    protected static final int agencia=1; 

    public Conta(){
        this.numero= SEQUENCIAL++; 
       
    }

    @Override
    public void sacar(double valor) {
        if(valor<=saldo){
            saldo=-valor;

        }
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    }
    public int getAgencia() {
        return agencia;
    }

    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
    


