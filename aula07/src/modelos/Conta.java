package modelos;
public class Conta {
    private int numConta;
    private int agencia;
    private Cliente titular;
    private Double saldo;
    
    //Criar construtor da classe

    
    public Conta(int numConta, int agencia, Cliente titular, double saldo){
        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo   = saldo;
    }
 
   
    public boolean sacar(double valor){
       if (this.saldo>=valor) {
        this.saldo -= valor;
        return true;
       }
       return false;    
    }

   public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }     
    }

    public boolean transferir(Conta destino,double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
       }else{
            return false;
       }
        
    }

    //Trocar nome do titular
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    protected void setSaldo(double valor){
        this.saldo = valor;
    }
    //Mostrar nome do titular
    public Cliente getTitular() {
        return titular;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public Double getSaldo(){
        return this.saldo;
    }

   public String toString(){
    return this.numConta+ " | "+this.agencia+" | "+this.titular;
   }
    
}
