
package aula011;

public class Aula011 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setSexo("M");
        a1.setIdade(28);
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Maria");
        b1.setSexo("F");
        b1.setIdade(20);
        b1.setMatricula(2222);
        b1.setCurso("Informática");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        
        
        
        
    }
    
}
