package teste;
import java.util.*;

public class atv03 {
    public static void main(String[] args){   
        try(Scanner d = new Scanner(System.in)){

            System.out.println("Insira um número limite: ");
            int n = d.nextInt();

            int num = 1;
            
            while(num <= n){
                if(num % 2 == 0){
                    System.out.println("Número Par: "+ num);
                }
                else{
                    System.out.println("Número impar: "+ num);
                }
                num++;    
            }
        }
        catch(Exception e){
            System.out.println("Valor inserido é invalido");
        }
    }
}
