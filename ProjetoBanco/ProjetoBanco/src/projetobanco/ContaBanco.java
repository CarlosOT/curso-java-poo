
package projetobanco;

public class ContaBanco {
    /*-----------------------------------------------> DEF. MÉTODO CONSTRUTOR*/
    //PADRÃO - Método especial construtor (tem o mesmo nome da Classe)
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    /*-------------------------------------------------------> DEF. ATRIBUTOS*/
    //PADRÃO - Atributos da classe(características)
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
        
    /*--------------------------------------------------------> DEF. MÉTODOS*/
    //PADRÃO - Métodos especiais acessores (getters) funcoes/return
    public int getNumConta(){
        return this.numConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getDono(){
        return this.dono;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    //PADRÃO - Métodos especiais modificadores(setters) procedimentos
    public void setNumConta(int nc){
        this.numConta = nc;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    
    //LÓGICA - Métodos específicos / personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        //
        if(t == "CC" || t == "cc"){
            this.setSaldo(50);
        }else if(t == "CP" || t == "cp"){
            this.setSaldo(150);
        }   
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("-----------AVISO-----------");
            System.out.println("Conta de " + this.getDono() + " Com Dinheiro [Não Pode Ser Fechada]");
            System.out.println("Saldo da conta: " + this.getSaldo());
        }else if(this.saldo < 0){
            System.out.println("-----------AVISO-----------");
            System.out.println("Conta de " + this.getDono() + " em Débito [Não Pode Ser Fechada]");
        }else{
            this.setStatus(false);
            System.out.println("CONTA DE " + this.getDono().toUpperCase() + " ENCERRADA");
        }
    }
    public void depositar(float v){
        if(this.getStatus() == true){
            System.out.println("");
            System.out.println("[+]DEPÓSITO REALIZADO COM SUCESSO DE " + this.getDono().toUpperCase());
            System.out.println("Valor do Depósito: " + v);
            System.out.println("Saldo Anterior: " + this.getSaldo());
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Saldo Atual: " + this.getSaldo());
        }else{
            System.out.println("-----------AVISO-----------");
            System.out.println("Não é Possível Depositar [Conta Fechada]");
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo() >=  v){
                System.out.println("");
                System.out.println("[-]SAQUE REALIZADO COM SUCESSO DE " + this.getDono().toUpperCase());
                System.out.println("Valor do Saque: " + v);
                System.out.println("Saldo Anterior: " + this.getSaldo());
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo Atual: " + this.getSaldo());
            }else{
                System.out.println("---IMPOSSÍVEL SACAR---");
                System.out.println("Saldo Insuficiente [Saldo atual: " + this.getSaldo() + " ]");
            }
        }else{
            System.out.println("-----------AVISO-----------");
            System.out.println("Não é Possível Sacar [Conta Fechada]");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(this.getTipo() == "CC" || this.getTipo() == "cc"){
            v = 12;
        }else if(this.getTipo() == "CP" || this.getTipo() == "cp"){
            v = 20;
        }
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                System.out.println("");
                System.out.println("MENSALIDADE COBRADA NA CONTA DE " + this.getDono().toUpperCase());
                System.out.println("Saldo Anterior: " + this.getSaldo());
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo Atual: " + this.getSaldo());
            }else{
                System.out.println("-----------AVISO-----------");
                System.out.println("Saldo Insuficiente para cobrança de mensalidade [Saldo atual: " + this.getSaldo() + " ]");
            }
        }else{
            System.out.println("-----------AVISO-----------");
            System.out.println("Não é Possível Fazer Cobrança [Conta Fechada]");
        }
    }
    
    /*------------------------------------------------------> MOSTRAR STATUS*/
    public void extratoConta(){
        System.out.println("");
        System.out.println("---EXTRATO DA CONTA DE " + this.getDono().toUpperCase() + "---");
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }      
}