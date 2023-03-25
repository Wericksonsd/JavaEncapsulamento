package JavaEncapsulamento;
import java.util.Scanner;

public class RecInfos {

    Scanner ipt = new Scanner(System.in);

    public int recInt(String x){
        int y;

        System.out.println(x);
        x = ipt.nextLine();
        y = Integer.parseInt(x);
        return y;
    }
    
    public float recFloat(String x){
        float y;

        System.out.println(x);
        x = ipt.nextLine();
        y = Float.parseFloat(x);
        return y;
    }

    public String recString(String x){

        System.out.println(x);
        x = ipt.nextLine();
        return x;
    }
}
