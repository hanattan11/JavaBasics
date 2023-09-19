package teste;
import java.util.*;

public class atv08 {
    public static void main(String[]Args){
        try(Scanner input = new Scanner(System.in)){

            System.out.println("Insira um número");
            int num = input.nextInt();
            int soma = 0; 
            int c = 0;

                while(num > 0){
                    c++;
                    soma+=num;
                    
                    System.out.println("Insira um número");
                    int numS = input.nextInt();
                    num = numS;

                }
            int media = soma / c;
            System.out.println("A media das notas é:"+media);
        }
        catch(Exception e){
            System.out.println("Valor invaido");
        }

    }    
}
