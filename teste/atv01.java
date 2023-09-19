package teste;
import java.util.*;

public class atv01 {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            
            System.out.println("Insira o 1º número: ");
            int n = s.nextInt();

            int num = 0;
            int soma = 0;
   
            while(num <= n){
                if(num % 2 == 0){
                    System.out.println(num + " Esse era o num. ");
                    soma += num;
                    System.out.print(soma + " ");
                }
                num++;
            }
        } 
        catch (Exception e) {
            System.out.print("Erro, valor inserido não é válido! ");
        }
    }
}