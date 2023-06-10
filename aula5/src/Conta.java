public class Conta {
    private int numConta;
    private int agencia;
    private String titular;
    private Double saldo;

    //criar construtor da classe

    public Conta (){
        
    } 

    public Conta (String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    } 

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }


  public void sacar(double valor){
    if(this.saldo>=valor){
        this.saldo -= valor;
    }
    System.out.println("FAZUELLLYYY");
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


  public void depositar(double valor){
    if(valor>0){
        this.saldo += valor;
    }
    System.out.println("tnc caloteiro");
  }
}


