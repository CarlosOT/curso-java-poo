
package projetobanco;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoBanco {

    private static void main(String[] args) throws InterruptedException {
        /*------------------------------------------------INSTANCIANDO OBJETO*/
        ContaBanco conta = new ContaBanco();
        Scanner teclado = new Scanner(System.in);
        ArrayList listaCliente = new ArrayList();
        ArrayList listaTipoConta = new ArrayList();
        ArrayList listaSaldo = new ArrayList();
        
        /*-----------------------------------------------DECLARANDO VARIÁVEL*/
        int opcao = 0;
        int numeroConta = 0;
        float saque, deposito;
        String primeiroNome, ultimoNome, nomeCompleto;
             
        /*----------------------------------------------------OPÇÕES USUÁRIO*/
        do{ //Programa repete
            System.out.println("");
            System.out.println("***********OPÇÕES BANCO***********");
            System.out.println("");
            System.out.println(
                    "(1) PARA ABRIR CONTA \n" +
                    "(2) PARA FECHAR CONTA \n" +
                    "(3) PARA PAGAR MENSALIDADE \n" +
                    "(4) PARA SACAR \n" +
                    "(5) PARA DEPOSITAR \n" +
                    "(6) PARA VER RESUMO DA ÚLTIMA CONTA ABERTA \n"+
                    "(7) PARA VER SALDO DA CONTA ÚLTIMA CONTA ABERTA \n" +
                    "(8) PARA VER RESUMO DE CLIENTES \n" +        
                    "(0) PARA ENCERRAR ATENDIMENTO \n");

            /*----------------------------------------------ENTRADA USUÁRIO*/
            System.out.print("ESCOLHA UMA DAS OPÇÕES ACIMA: ");
            opcao = teclado.nextInt();

            /*-----------------------------------------------------CONDIÇÕES*/
            //Abrir conta
            if(opcao == 1){
                //Definindo nome dono da conta
                System.out.println("");
                System.out.print("DIGITE SEU PRIMEIRO NOME: ");
                primeiroNome = teclado.next().toUpperCase();
                System.out.print("DIGITE SEU ÚLTIMO NOME: ");
                ultimoNome = teclado.next().toUpperCase();
                nomeCompleto = (primeiroNome + " " + ultimoNome);
                conta.setDono(nomeCompleto);
                
                //Definindo número de contas
                numeroConta += 1;
                conta.setNumConta(numeroConta);
                
                //Inserindo nome do cliente dentro de lista
                listaCliente.add("");//Primeiro indice desconsiderado
                listaCliente.add(numeroConta,nomeCompleto);
               
                //Conta poupança ou conta corrente
                System.out.println("");
                System.out.println("(1) CONTA POUPANÇA \n(2) CONTA CORRENTE");
                System.out.print("ESCOLHA UMA DAS OPÇÕES ACIMA: ");
                int tipoConta = teclado.nextInt();
                if(tipoConta == 1){
                    conta.abrirConta("cp");
                    System.out.println("");
                    System.out.println("CONTA POUPANÇA DE " + nomeCompleto + " ABERTA!");
                }else if(tipoConta == 2){
                    conta.abrirConta("cc");
                    System.out.println("");
                    System.out.println("CONTA CORRENTE DE " + nomeCompleto + " ABERTA!");
                }

                //Inserindo tipo de conta dentro de lista
                listaTipoConta.add("");//Primeiro indice desconsiderado  
                if(tipoConta == 1){
                    listaTipoConta.add(numeroConta, "CONTA POUPANÇA");
                }else if(tipoConta == 2){
                    listaTipoConta.add(numeroConta, "CONTA CORRENTE");
                }    
            }
            //Fechar conta
            if(opcao == 2){
                if(conta.getStatus() == false){
                    System.out.println("");
                    System.out.println("NÃO HÁ CONTA EM ABERTO");
                }else{
                    System.out.println("");
                    conta.fecharConta();
                }       
            }
            //Pagar mensalidade
            if(opcao == 3){
                System.out.println("");
                conta.pagarMensal();
            }
            //Sacar
            if(opcao == 4){
                System.out.println("");
                System.out.print("DIGITE O VALOR A SER SACADO: ");
                saque = teclado.nextFloat();
                conta.sacar(saque);
            }
            //Depositar
            if(opcao == 5){
                System.out.println("");
                System.out.print("DIGITE O VALOR A SER DEPOSITADO: ");
                deposito = teclado.nextFloat();
                conta.depositar(deposito);     
            }
            //Extrato da conta
            if(opcao == 6){
                if(conta.getStatus() == false){
                    System.out.println("");
                    System.out.println("NÃO HÁ CONTA PARA VER EXTRATO");
                }else{
                    conta.extratoConta();
                }   
            }
            //Consultar saldo
            if(opcao == 7){
                if(conta.getStatus() == false){
                   System.out.println("");
                   System.out.println("NÃO HÁ CONTA PARA VER SALDO"); 
                }else{
                    System.out.println("TITULAR CONTA: " + conta.getDono());
                    System.out.println("SALDO ATUAL: " + conta.getSaldo());
                }
            }
            
            //Inserindo saldo da conta dentro de lista
                listaSaldo.add("");//Primeiro indice desconsiderado
                listaSaldo.add(numeroConta, conta.getSaldo());
            
            
            //Listar clientes
            if(opcao == 8){
                if(numeroConta >= 1){
                    System.out.println("");
                    System.out.println("------LISTA CLIENTES------"); 
                    for(int c = 1; c <= numeroConta; c++){
                        System.out.println("CONTA " + numeroConta + " / " + listaCliente.get(c) //quebra linha
                        + "[" + listaTipoConta.get(c) + "] " + "SALDO ATUAL: R$" + listaSaldo.get(c));
                    }              
                }else{
                   System.out.println("");
                   System.out.println("------LISTA CLIENTES ZERADA------"); 
                }
            }  
        System.out.println("");
        System.out.println("(9) PARA VOLTAR AO MENU ANTERIOR \n(0) PARA ENCERRAR");
        System.out.print("ESCOLHER UMA DAS OPÇÕES ACIMA: ");
        opcao = teclado.nextInt();
        }while(opcao != 0); //Programa repete
    }
    
}
