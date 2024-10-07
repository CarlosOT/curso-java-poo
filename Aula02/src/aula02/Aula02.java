package aula02;

import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        //-------------------------------------------------------------BLOCO 1
       //instaciando objetos
        Caneta c1 = new Caneta();
        Scanner teclado = new Scanner(System.in);
        
        //chamando e definindo atributos separados
        c1.ponta = 0.5f;
        c1.modelo = "Caneta Bic";
        c1.carga = 58;
        c1.cor = "Azul";
        c1.tampada = false;
        
        //entrada usuário (cor da caneta)
        System.out.print("Escola a cor da sua caneta: ");
        String corCaneta = teclado.next();
        c1.cor = corCaneta;
        
        // entrada usuário (carga da caneta)
        System.out.print("Valor carga inicial da caneta: ");
        int cargaCaneta = teclado.nextInt();
        c1.carga = cargaCaneta;
           
        //chamando métodos (procedimentos)
        c1.destampar();
        c1.rabiscar();
        c1.status();
       
        
        //-------------------------------------------------------------BLOCO 2
        //instaciando objeto "c2" da classe "Caneta"
        Caneta c2 = new Caneta();
        
        //chamando e definindo atributos
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 89;
        
        //chamando métodos (procedimentos)
        
    }
    
}
