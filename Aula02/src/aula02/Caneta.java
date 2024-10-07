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
        System.out.println("------Informações--------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    //definindo métodos/ações/comportamentos (procedimento não tem retorno)
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar, estou tampada");
        }else{
            Scanner teclado = new Scanner(System.in);
            System.out.print("Quantos rabiscos você quer fazer? ");
            int nRabiscos = teclado.nextInt();
            for(int c=0; c < nRabiscos; c++){
                System.out.println("Rabiscando...");
                this.carga -= 1;
            }
            System.out.println("Novo valor de carga: " + this.carga);
        }
    }
    
    void tampar(){
      this.tampada = true;  
    }
    
    void destampar(){
        this.tampada = false;
    }
        
}
