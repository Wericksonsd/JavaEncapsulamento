package JavaEncapsulamento;

public class Endereco {
    
    int num;
    String rua;
    String cidade;

    public int getNum(){
        return num;
    }

    public String getRua(){
        return rua;
    }

    public String getCidade(){
        return cidade;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
}
