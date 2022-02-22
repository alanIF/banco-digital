
import java.util.ArrayList;
import java.util.Scanner;

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
       int menu= -1;
       int opcoes= -1;
       Scanner s = new Scanner(System.in);
       BD bd = new BD();
       while(menu !=0){
           System.out.println(" Menu de Opções : (0) - Encerrar Programa; (1) - Adicionar Cliente ; (2) - Listar Clientes");
           menu= s.nextInt();
           switch (menu){
            case 1:
                System.out.println("Digite o nome do novo cliente: ");
                Cliente c = new Cliente();
               
                c.setNome(s.next());
                
                while(opcoes != 0){
                    System.out.println(" Opções : (0) - Voltar pro menu anterior;  (1) - Adicionar Conta para este cliente ; (2) - Exibir dados bancários ");
                    opcoes= s.nextInt();

                    switch(opcoes){
                        case 1:
                            System.out.println("Tipo de Conta : (1)- Corrente ; (2) - Poupança");
                            int tipo ;
                            tipo = s.nextInt();
                            if(tipo==1){
                                Conta conta = new ContaCorrente();
                                conta.setSaldo(0);
                                System.out.println("Digite a conta: ");
                                conta.setConta(s.nextInt());
                                c.getContas().add(conta);
  
                            }else if (tipo==2){
                                 Conta conta = new ContaPoupanca();
                                 conta.setSaldo(0);
                                 System.out.println("Digite a conta: ");
                                 conta.setConta(s.nextInt());
                                 c.getContas().add(conta);
                                 
                            }else{
                                System.out.println("Tipo de conta inválida");
                            }
                            break;
                        case 2:
                            ArrayList<Conta> contas = c.getContas();
                            for(Conta contasCliente :contas){
                                contasCliente.imprimirExtrato();
                                System.out.println("<--------------->");
                            }
                        break;    
                    }
                }
                bd.getClientes().adicionar(c);
                System.out.println("Cliente adicionado com sucesso !");
                System.out.println("<! ------- !>");
                opcoes= -1;

                break;
            case 2:
                            for(Cliente cliente:bd.getClientes().clientes){
                                System.out.println("Cliente: "+cliente.getNome());
                                System.out.println("<--------------->");
                            }
                            
                break;

            }
       }
    }
}
