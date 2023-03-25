package JavaEncapsulamento;

public class testAlun {
    
    public static void main (String arg[]){

        Aluno a1 = new Aluno();
        RecInfos rec = new RecInfos();


        System.out.println("Digite as informacoes referente ao aluno!\n\n");

    
        a1.getDoc().setNome(rec.recString("--Nome:")); 
        a1.getDoc().setDtNasc(rec.recString("--Data de Nascimento:"));
        a1.getCso().setCnome(rec.recString("--Curso:"));
        a1.getCso().setPer(rec.recInt("--Periodo:"));

        System.out.println("O aluno "+a1.getDoc().getNome()+" cursa o "+a1.getCso().getPer()+" de "+a1.getCso().getCnome());

        int x = rec.recInt("Num1");
        int y = rec.recInt("Num2");
        System.out.println(x + y);
    }
}
