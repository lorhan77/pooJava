package testes;

public class Funcionario extends Pessoa {
    String codigo;
    String cargo;
    double salario;

    public Funcionario(String nome, String cpf,  String nascimento, String codigo, String cargo,double salario){
        super(nome, cpf, nascimento);
        this.codigo = codigo;
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getCargo() {
        return cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public double getSalario() {
        return salario;
    }



    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Maria Souza","13987321312","14/02/200", "1312312312", "Assistente do Gerente Regional", 4000);
        f1.setNome("Joao lixo");
        f1.setCpf("21321321321321");

        System.out.println(f1);
        
    }
}
