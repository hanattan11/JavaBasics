package teste;
import java.util.*;

public class atv05 {
    public static void main(String[] args) {

        // Ele vai esperar receber um valor, caso não ele vai imprimir uma mensagem de erro.
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Insira o número de Patos: ");
            int patos = scanner.nextInt();

            int patosRestantes = patos;

            for (int n = 0; n < patos; n++) {
                System.out.println(patosRestantes + " patinhos foram passear....");
                System.out.println("Além das montanhas... Para brincar.... ");
                System.out.println("A coisa falou: ");

                for (int j = 1; j <= patosRestantes; j++) {
                    System.out.print("Quá... ");
                }
                System.out.print("\n");

                System.out.println("Mas só " + (--patosRestantes) + " Voltaram de lá.");
                System.out.print("\n");
            }

            System.out.println("A coisa foi procurar...");
            System.out.println("Além das montanhas... na beira do negócio...");
            System.out.println("A coisa falou: ");

            for (int j = 1; j <= patos; j++) {
                System.out.print("Quá... ");
            }

            System.out.println("E todos " + patos + " patos voltaram.");
        } catch (Exception e) {
            System.out.println("Valor inserido inválido!");
        }
    }
}
