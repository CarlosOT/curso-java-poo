package aula02;

import java.util.Scanner;

public class Caneta {
    // definindo atributos (características)
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // verificando os status do objeto criado (método que não tem retorno)
    void status(){
        System.out.println("");
        System.out.println("---------------STATUS---------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if(this.tampada == true){
            System.out.println("Caneta tampada: " + "SIM");
        }else{
            System.out.println("Caneta está tampada: " + "NÃO");
        }
    }
    
    //caneta tem tampa ou não (definindo métodos/ações/comportamentos)
    void tampar(){
      this.tampada = true;  
    } 
    void destampar(){
        this.tampada = false;
    }
    
    // verifica se a caneta está com tampa e a carga atual da caneta (método)
    void rabiscar(){
        String continuar = "";
        do{    
            if(this.tampada == true){
                System.out.println("ERRO! A caneta não pode rabiscar estando TAMPADA");
            }else if (this.tampada == false){
                Scanner teclado = new Scanner(System.in);
                System.out.print("Recarregue a sua caneta: ");
                int valorRecarga = teclado.nextInt();
                this.carga += valorRecarga;
                System.out.print("Digita a quantidade de rabiscos: ");
                int nRabiscos = teclado.nextInt();
                
                System.out.println("");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("Rabiscando " + nRabiscos + " vezes ... ");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("");
                
                for(int c=0; c < nRabiscos; c++){
                    this.carga -= 1;
                    }
                
                if(this.carga <= 0){
                    System.out.println("O valor da carga ACABOU, compre outra caneta!");
                }else if(this.carga > 0 && this.carga <20){
                    System.out.println("O valor da carga está acabando: " + "[" + this.carga + "]");
                    System.out.println("Valor atual da carga: " + this.carga);
                }else{
                    System.out.println("Valor atual da carga: " + this.carga);
                } 
                
                System.out.println("-----------------------------");
                System.out.print("Deseja continuar rabiscando? [Clique > S]");
                continuar = teclado.next().toUpperCase();
            }    
        }while(continuar.equals("S"));          
    }             
}
