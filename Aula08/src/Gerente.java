public class Gerente extends Funcionario {
    private String Formacao;
    private static double salMinimo = 1320.0;


    public Gerente(String nome, String telefone, String email,  String Formacao) {
        super(nome, telefone, email, salMinimo);
        this.Formacao = Formacao;
    }

    public String getSetorTrab() {
        return Formacao;
    }

    public void setSetorTrab(String Formacao) {
        this.Formacao = Formacao;
    }

    public double setSalarioTotal(double TotalVendido){

        double CalcSalario =  (TotalVendido * 3)/100;
        double Sal = (salMinimo*4) + CalcSalario; 
        return Sal;
    }
    
    
}
