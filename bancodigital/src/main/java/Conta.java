/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class Conta implements IConta{
    
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
        if(valor<=this.saldo){
            this.saldo=-valor;

        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo>=valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        
    }
    
    
    protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
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
    


