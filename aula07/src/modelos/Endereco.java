package modelos;
public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    private String numCasa;
    
    public Endereco() {

    }
    public Endereco(String rua, String bairro, String cep, String numCasa) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numCasa = numCasa;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNumCasa() {
        return numCasa;
    }
    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }


}
