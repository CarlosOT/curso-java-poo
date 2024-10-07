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
            System.out.println("Rabiscando " + nRabiscos + " vezes ... ");
            for(int c=0; c < nRabiscos; c++){
                this.carga -= 1;
            }
            if(this.carga <= 0){
                System.out.println("O valor da carga ACABOU, compre outra caneta!");
            } else if(this.carga > 0 && this.carga <20){
                System.out.println("O valor da carga está acabando: " + "[" + this.carga + "]");
                System.out.println("Valor atual da carga: " + this.carga);
            } else{
                System.out.println("Valor atual da carga: " + this.carga);
            }
            
        }
    }
    
    void tampar(){
      this.tampada = true;  
    }
    
    void destampar(){
        this.tampada = false;
    }
        
}
