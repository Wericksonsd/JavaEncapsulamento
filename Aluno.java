package JavaEncapsulamento;
public class Aluno{

    Documento doc = new Documento();
    Curso cso = new Curso();
    
    public Documento getDoc(){
        return doc;
    }

    public Curso getCso(){
        return cso;
    }

    public void setDoc(Documento doc){
        this.doc = doc;
    }

    public void setCso(Curso cso){
        this.cso = cso;
    }

}