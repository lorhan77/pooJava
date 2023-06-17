public class Telefone {
    private int ddd;
    private String numeroTelefone;
    private String descricao;

    public Telefone(){

    }

    public Telefone(int ddd,String numeroTelefone,String descricao ){
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
        this.descricao = descricao;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return this.ddd+" | "+this.numeroTelefone;
    }
}
