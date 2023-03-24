package JavaEncapsulamento;

public class testAlun {
    
    public static void main (String arg[]){

        Aluno a1 = new Aluno();
        RecInfos rec = new RecInfos();


        System.out.println("Digite as informacoes referente ao aluno!\n\n");

        String nomea = rec.recString("--Nome:   ");
        a1.getDoc().setNome(nomea);

        
        a1.getDoc().setDtNasc(dtnasc);


    }
}
