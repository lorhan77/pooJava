package modelos;

public class ContaPoupanca extends Conta{
    private double rendimentos;

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente titular) {
        super(agencia, numero, saldo, titular);
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }

    
}
