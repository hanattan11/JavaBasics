package teste;
import java.util.*;

public class atv02 {
    public static void main(String[] args){

        try(Scanner d = new Scanner(System.in)){

            int n = 0;

            System.out.println("Insira o número de Patos: ");
            int patos = d.nextInt();

            while(n < patos){

               int des = patos;

                System.out.println((patos -  n)+ " patinhos foram passear....");
                System.out.println("Além das montanhas... Para brincar.... ");
                System.out.println("A coisa falou: ");
             
                for(int j = 1; j <= (patos - n); j++){
                    System.out.print("Quá... ");
                }
               
                n++;
                System.out.println("Mas só " + (des -= n) + " Voltaram de lá.");
                System.out.println("-");
            }
            
            System.out.println("A coisa foi procurar...");
            System.out.println("Além das montanhas... na beira do negocio...");
            System.out.println("A coisa falou: ");

            for(int j = 1; j <= patos; j++){
                System.out.print("Quá... ");
            }
            System.out.println("E todos "+patos+" patos voltaram.");
        
        }
        catch (Exception e) {
            System.out.println("valor inserido Invalido!");
        }
    }
    
}
