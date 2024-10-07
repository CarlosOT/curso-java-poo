package aula02;

import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        //-------------------------------------------------------------BLOCO 1
       //instaciando objetos
        Caneta c1 = new Caneta();
        Scanner teclado = new Scanner(System.in);
        
        //entrada usuário (cor da caneta)
        System.out.print("Escola a cor da sua caneta: ");
        String corCaneta = teclado.next();
        c1.cor = corCaneta;
        
        // entrada usuário (carga da caneta)
        System.out.print("Valor carga inicial da caneta: ");
        int cargaCaneta = teclado.nextInt();
        c1.carga = cargaCaneta;
           
        //chamando métodos (procedimentos)
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
    }
    
}
