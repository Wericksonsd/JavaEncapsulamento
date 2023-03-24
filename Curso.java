package JavaEncapsulamento;

public class Curso {
    
    String cnome;
    String grau;
    int per;
    String ing;

    public String getCnome(){
        return cnome;
    }

    public String getGrau(){
        return grau;
    }

    public String getIng(){
        return ing;
    }

    public int getPer(){
        return per;
    }

    public void setCnome(String cnome){
        this.cnome = cnome;
    }

    public void setGrau(String grau){
        this.grau = grau;
    }

    public void setIng(String ing){
        this.ing = ing;
    }

    public void setPer(int per){
        this.per = per;
    }
    
}
