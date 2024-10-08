
package metodosgettersetterconstrutor;

import java.util.Scanner;

public class MetodosGetterSetterConstrutor {

    public static void main(String[] args) {
        /*-------------------------------------------------->CRIANDO OBJETOS*/
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        Scanner teclado = new Scanner(System.in);
        
        /*------------------------------------>MODIFICANDO VALORES ATRIBUTOS*/
        //objeto c1
        System.out.println("CANETA 1 ...");
        System.out.print("Modelo: ");
        String modelo = teclado.next().toUpperCase();
        c1.setModelo(modelo); // c1.modelo = "Bic2"; (atributo "modelo" privado)
        
        System.out.print("Ponta [5,7]: ");
        float ponta = teclado.nextFloat();
        c1.setPonta(ponta); // c1.ponta = 5.7f; (atributo "ponta" privado)
        
        System.out.print("Cor: ");
        String cor = teclado.next().toUpperCase();
        c1.setCor(cor);
        
        System.out.print("Tampada [S/N]: ");
        String tampada = teclado.next().toUpperCase();
        if(tampada.equals("S")){
            c1.tampar();
        }else{
            c1.destampar();
        }
        
        //objeto c2
        System.out.println("CANETA 2 ...");
        System.out.print("Modelo: ");
        String modelo2 = teclado.next().toUpperCase();
        c2.setModelo(modelo2); // c2.modelo = "Bic2"; (atributo "modelo" privado)
        
        System.out.print("Ponta [5,7]: ");
        float ponta2 = teclado.nextFloat();
        c2.setPonta(ponta2); // c2.ponta = 5.7f; (atributo "ponta" privado)
        
        System.out.print("Cor: ");
        String cor2 = teclado.next().toUpperCase();
        c2.setCor(cor2);
        
        System.out.print("Tampada [S/N]: ");
        String tampada2 = teclado.next().toUpperCase();
        if(tampada2.equals("S")){
            c2.tampar();
        }else{
            c2.destampar();
        }
       
        /*----------------------------------------->ACESSANDO VALOR ATRIBUTO*/
        c1.status(); //status objeto 1 (exemplo print)
        System.out.println("CANETA 1: Tenho uma caneta " + c1.getModelo() + 
                " de ponta " + c1.getPonta());
        
        c2.status(); //status objeto 2 (exemplo print)
        System.out.println("CANETA 2: Tenho uma caneta " + c2.getModelo() +
                " de ponta " + c2.getPonta());       
    }  
}
