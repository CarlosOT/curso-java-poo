
package projetobanco;

public class ProjetoBanco {

    public static void main(String[] args) {
        //INSTANCIANDO OBJETOS
        ContaBanco conta = new ContaBanco();
        
        //MENU
        System.out.println("");
        System.out.println("***********OPÇÕES BANCO***********");
        System.out.println("");
        System.out.println(
                "(1) PARA ABRIR CONTA [cc/cp] \n" +
                "(2) PARA FECHAR CONTA \n" +
                "(3) PARA PAGAR MENSALIDADE \n" +
                "(4) PARA SACAR \n" +
                "(5) PARA DEPOSITAR \n" +
                "(6) PARA VER EXTRATO DA CONTA");
    }
    
}
