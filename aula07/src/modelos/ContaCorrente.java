package modelos;

public class ContaCorrente extends Conta{

    private double taxaOperacional;
    private double limite;

    

    public ContaCorrente(int numConta, int agencia, Cliente titular, double saldo) {
        super(numConta, agencia, titular, saldo);
        this.taxaOperacional = 0.15;
        this.limite = 500;
    }

    public double getTaxaOperacional() {
        return taxaOperacional;
    }

    public void setTaxaOperacional(double taxaOperacional) {
        this.taxaOperacional = taxaOperacional;
        
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        double vlrAutorizado = this.limite + this.getSaldo();
        if(vlrAutorizado >= valor){
            this.setSaldo(this.getSaldo()-(valor+taxaOperacional));
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        ContaCorrente cc = new ContaCorrente(222, 4545, cli1, 50000);
        cc.setSaldo(1000);
        System.out.println(cc.sacar(2000)); 
        System.out.println(cc.getSaldo());
        cc.depositar(10000);
        System.out.println(cc.getSaldo());
    }
}
