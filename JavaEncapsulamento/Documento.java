package JavaEncapsulamento;

public class Documento {
    
    String nome;
    String dtnasc;
    String rg;
    String cpf;
    Endereco ender = new Endereco();

    public String getNome(){
        return nome;
    }

    public String getDtNasc(){
        return dtnasc;
    }

    public String getRg(){
        return rg;
    }

    public String getCpf(){
        return cpf;
    }

    public Endereco getEnder(){
        return ender;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDtNasc(String dtnasc){
        this.dtnasc = dtnasc;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEnder(Endereco ender){
        this.ender = ender;
    }

}
