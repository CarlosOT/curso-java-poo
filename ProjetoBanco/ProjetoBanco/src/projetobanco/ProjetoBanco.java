
package projetobanco;

import java.util.Scanner;

public class ProjetoBanco {

    public static void main(String[] args) {
        /*------------------------------------------------INSTANCIANDO OBJETO*/
        ContaBanco conta = new ContaBanco();
        Scanner teclado = new Scanner(System.in);
        
        /*-----------------------------------------------DECLARANDO VARIÁVEL*/
        int opcao = 0;
        int numeroContas = 0;
        String primeiroNome, ultimoNome, nomeCompleto;
        
        /*----------------------------------------------------OPÇÕES USUÁRIO*/
        do{ //Programa repete
            System.out.println("");
            System.out.println("***********OPÇÕES BANCO***********");
            System.out.println("");
            System.out.println(
                    "(1) PARA ABRIR CONTA [cc/cp] \n" +
                    "(2) PARA FECHAR CONTA \n" +
                    "(3) PARA PAGAR MENSALIDADE \n" +
                    "(4) PARA SACAR \n" +
                    "(5) PARA DEPOSITAR \n" +
                    "(6) PARA VER EXTRATO DA CONTA \n"+
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
                
                //definindo número de contas
                numeroContas += 1;
                conta.setNumConta(numeroContas);
                
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
                
            }
            //Fechar Conta
            if(opcao == 2){
                System.out.println("");
                conta.fecharConta();
            }
            
            //Extrato da conta
            if(opcao == 6){
                conta.extratoConta();
            }
        
        }while(opcao != 0); //Programa repete
    }
    
}
