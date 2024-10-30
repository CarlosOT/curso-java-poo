
package projetopessoas;

public class Aluno extends Pessoa{
    //ATRIBUTOS
    private int mat;
    private String curso;
    
    //MÉTODOS
    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
