public class Endereco {
    private String rua;
    private String cep;
    private String numCasa;
    private String bairro;

    public Endereco(){

    }
    
    public Endereco(String rua,String cep,String numCasa,String bairro ){
        this.rua = rua;
        this.cep = cep;
        this.numCasa = numCasa;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    } 

    public String toString(){
        return "Rua: "+this.rua+" | "+"CEP: "+this.cep+" | "+"Numero da casa: "+this.numCasa+" | "+"Bairro: "+this.bairro;
    }
}


