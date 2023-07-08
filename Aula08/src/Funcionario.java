public class Funcionario {
    private String nome;
    private String telefone;
    private String email;
    private static double salMinimo = 1320.0;

    
    public Funcionario(String nome, String telefone, String email, double salMinimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalMinimo() {
        return salMinimo;
    }

    public double setSalarioTotal(double TotalVendido){

        double CalcSalario =  (TotalVendido * 2)/100;
        double Sal = (salMinimo*2) + CalcSalario; 
        return Sal;
    }

}
