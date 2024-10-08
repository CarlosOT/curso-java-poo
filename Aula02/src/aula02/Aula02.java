package aula02;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        //-------------------------------------------------------------BLOCO 1
       //instaciando objetos
        Caneta c1 = new Caneta();
        Scanner teclado = new Scanner(System.in);
        
        //apresentação programa
        c1.println("###########################");
        c1.println("---- PROGRAMA CANETA -----");
        c1.println("###########################");
        c1.println("");
        
        // entrada usuário (modelo caneta)
        System.out.print("Modelo da caneta: ");
        String modeloCaneta = teclado.next();
        c1.modelo = modeloCaneta;
        c1.println("///");
        
        //entrada usuário (ponta caneta)
        System.out.print("Ponta da caneta [ex.5.7]: ");
        String pontaString = teclado.next().replace(",",".");
        float pontaCaneta = Float.parseFloat(pontaString);
        c1.ponta = pontaCaneta;
        c1.println("///");
        
        //entrada usuário (cor da caneta)
        System.out.print("Escola a cor da sua caneta: ");
        String corCaneta = teclado.next();
        c1.cor = corCaneta;
        c1.println("///");
        
        // entrada usuário (caneta tampada ou não)
        System.out.print("Destampe a caneta para rabiscar [Clique > S]: ");
        String canetaTampada = teclado.next().toUpperCase();
        
        if(canetaTampada.equals("S")){
            c1.destampar();
            c1.rabiscar();
            c1.status();
        }else{
            c1.tampar();
            c1.rabiscar();
            c1.status();
        }
        
        /*
        chamando métodos (procedimentos)
        c1.tampar();
        c1.rabiscar();
        c1.status();
        */
        
    }
    
}
