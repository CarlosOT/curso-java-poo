package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        //-------------------------------------------------------------BLOCO 1
       //instaciando objeto "c1" da classe "Caneta" 
        Caneta c1 = new Caneta();
        
        //chamando e definindo atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Caneta Bic";
        c1.carga = 58;
        
        //chamando métodos (procedimentos)
        c1.destampar();
        c1.status();
        c1.rabiscar();
       
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
