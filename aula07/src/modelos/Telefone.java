package modelos;
public class Telefone {
    private int ddd;
    private String numTelefone;
    private String descricao;

    public Telefone() {
    }

    public Telefone(int ddd, String numTelefone, String descricao) {
        this.ddd = ddd;
        this.numTelefone = numTelefone;
        this.descricao = descricao;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String toString(){
        return this.ddd +" "+this.numTelefone;
    }

    
    

}
