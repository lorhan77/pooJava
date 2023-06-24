package testes;

public class Estudante extends Pessoa{

    private String matricula;
    private String status;

    public Estudante(String nome, String cpf,  String nascimento, String matricula, String status){
        super(nome,cpf,nascimento);
        this.matricula = matricula;
        this.status = status;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
