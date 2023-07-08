public class Vendedor extends Funcionario {
    private String setorTrab;
    private static double salMinimo = 1320.0;


    public Vendedor(String nome, String telefone, String email,  String setorTrab) {
        super(nome, telefone, email, salMinimo);
        this.setorTrab = setorTrab;
    }

    public String getSetorTrab() {
        return setorTrab;
    }

    public void setSetorTrab(String setorTrab) {
        this.setorTrab = setorTrab;
    }

    public double setSalarioTotal(double TotalVendido){

        double CalcSalario =  (TotalVendido * 2)/100;
        double Sal = (salMinimo*2) + CalcSalario; 
        return Sal;
    }
    
    
}
