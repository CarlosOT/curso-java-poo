
package projetobanco;

public class ProjetoBanco2 {
    //SEGUNDO ARQUIVO CRIADO PARA TESTE (VOLTAR COMO 'PUBLIC' MAIN ARQUIVO 1
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        ContaBanco p2 = new ContaBanco();
        
        p1.setDono("João");
        p1.setNumConta(1111);
        p1.abrirConta("cp");
        p1.depositar(100);
        p1.sacar(55);
        p1.pagarMensal();
        p1.sacar(200);
        //EXTRATO CONTA 1
        p1.extratoConta();
        
        p2.setDono("Maria");
        p2.setNumConta(2222);
        p2.abrirConta("cc");
        p2.depositar(500);
        p2.sacar(100);
        p2.pagarMensal();
        p2.sacar(400);
        p2.sacar(38);
        p2.fecharConta();
        //EXTRATO CONTA 2
        p2.extratoConta();
    }
}
