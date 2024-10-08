package aula02;

import java.util.Scanner;

public class Caneta {
    // definindo atributos (características)
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
    
    // verificando os status do objeto criado (método que não tem retorno)
    public void status(){
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
    public void tampar(){
      this.tampada = true;  
    } 
    protected void destampar(){
        this.tampada = false;
    }
    
    // verifica se a caneta está com tampa e a carga atual da caneta (método)
    public void rabiscar(){
        String continuar = "";
        do{    
            if(this.tampada == true){
                System.out.println("ERRO! A caneta não pode rabiscar estando TAMPADA");
            }else if (this.tampada == false){
                System.out.println("CARGA ATUAL DA CANETA: " + this.carga);
                Scanner teclado = new Scanner(System.in);
                System.out.print("Recarregue a sua caneta: ");
                int valorRecarga = teclado.nextInt();
                this.carga += valorRecarga;
                System.out.println("CARGA ATUAL DA CANETA: " + this.carga);
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
                    System.out.println("O valor da carga ACABOU, recarregue a sua caneta!");
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
    
    // teste criando método/procedimento print (sem linha)
    public void print(String a){
        System.out.print(a);
    }
    
    // teste criando método/procedimento print (pulando linha)
    public void println(String a){
        System.out.println(a);
    }
}
