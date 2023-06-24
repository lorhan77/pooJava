package modelos;
public class Cliente {
   private String nome;
   private Endereco endereco;
   private Telefone telefone;
   private String email;

    public Cliente() {
    }

    public Cliente(String nome, Endereco endereco, Telefone telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    //gerar os getters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Telefone getTelefone() {
        return telefone;
    }


    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String toString(){
        return "Cliente: "+this.nome+"\nE-mail: "+this.email;
    }
 
}
