package teste;
import java.util.*;

public class atv07 { 
    public static void main(String[] Args){

        try(Scanner d = new Scanner(System.in)){    
            int soma = 0;
            System.out.println("Insira um número para ser o limite da soma:");
            int numero =  d.nextInt();
                for(int i = 1; i <= numero; i++){
                    if(i % 2 == 0){
                    soma+=i;
                    }
                }
            System.out.println("A soma dos pares é:"+soma);
        } 
        catch (Exception e) {
            System.out.println("Valor invalido.");
        }

    }
}
