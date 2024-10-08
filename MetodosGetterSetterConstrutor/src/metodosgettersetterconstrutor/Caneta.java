
package metodosgettersetterconstrutor;

public class Caneta {
    /*---------------------------------------------> DEF. MÉTODO CONSTRUTOR*/
    //Método construtor tem o mesmo nome da Classe
    public Caneta(){ //(String m, String c, float p) É possível criar c/ parametros
        this.setModelo("BIC"); // recebe "m"
        this.setCor("ROSA"); // recebe "c"
        this.setPonta(0.7f); // recebe "p"
        this.tampar();    
    }
    
    /*-----------------------------------------------------> DEF. ATRIBUTOS*/
    //Atributos da classe(características)
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    /*--------------------------------------------------------> DEF. MÉTODOS*/
    //Métodos acessores (getters) funcoes
    public String getModelo(){
        return this.modelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public String getCor(){
        return this.cor;
    }
    
    //Métodos modificadores(setters) procedimentos
    public void setModelo(String m){
       this.modelo = m; 
    }
    public void setPonta(float p){
         this.ponta = p;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    //Método 
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    /*------------------------------------------------------> MOSTRAR STATUS*/
    public void status(){
        System.out.println("");
        System.out.println("----- SOBRE A CANETA -----");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
}
