
package metodosgettersetterconstrutor;

public class MetodosGetterSetterConstrutor {

    public static void main(String[] args) {
        /*-------------------------------------------------->CRIANDO OBJETOS*/
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        /*------------------------------------>MODIFICANDO VALORES ATRIBUTOS*/
        c1.setModelo("Bic"); // c1.modelo = "Bic2"; (atributo "modelo" privado)
        c1.setPonta(0.5f); // c1.ponta = 5.7f; (atributo "ponta" privado)
        c1.destampar();
        
        c2.setCor("ROXO");
        c2.tampar();
       
        /*----------------------------------------->ACESSANDO VALOR ATRIBUTO*/
        c1.status(); //status objeto 1
        System.out.println("CANETA 1: Tenho uma caneta " + c1.getModelo() + 
                " de ponta " + c1.getPonta());
        
        c2.status(); //status objeto 2
        System.out.println("CANETA 2: Tenho uma caneta " + c2.getModelo() +
                " de ponta " + c2.getPonta());       
    }  
}
