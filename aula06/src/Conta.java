
public class Conta {
    private int numConta;
    private int agencia;
    private Cliente titular;
    private Double saldo;
    
    //Criar construtor da classe

    public Conta(){

    }

    public Conta(Cliente titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public Conta(int numConta, int agencia, Cliente titular, double saldo){
        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }
 
   
    public void sacar(double valor){
       if (this.saldo>=valor) {
        this.saldo -= valor;
       }         
    }

   public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }     
    }

    public boolean transferir(Conta destino, double valor){
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

    //Mostrar nome do titular
    public Cliente getTitular(){
        return this.titular;
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
        return "Numero da conta: "+this.numConta+" |"+"Numero da Agencia: "+this.agencia+"|"+this.titular+"|"+"Saldo: "+this.saldo;
        }
}
