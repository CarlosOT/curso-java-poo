
package projetobanco;

public class ProjetoBanco2 {
    //SEGUNDO ARQUIVO CRIADO PARA TESTE (VOLTAR COMO 'PUBLIC' MAIN ARQUIVO 1
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("João");
        p1.setNumConta(1111);
        p1.abrirConta("cp");
        
        ContaBanco p2 = new ContaBanco();
        p2.setDono("Maria");
        p2.setNumConta(2222);
        p1.abrirConta("cc");
        
        
        
        
        
        p1.extratoConta();
        p2.extratoConta();
    }
}
