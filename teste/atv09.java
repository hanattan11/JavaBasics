package teste;
import java.util.Scanner;

public class atv09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int soma = 0;
            int contador = 0;

            while (true) {
                System.out.println("Insira uma nota (ou um número negativo para parar):");
                int nota = input.nextInt();

                if (nota < 0) {
                    break; // Sair do loop se uma nota negativa for inserida
                }
                soma += nota;
                contador++;
            }

            if (contador > 0) {
                double media = (double) soma / contador;
                System.out.println("A média das notas é: " + media);
            } else {
                System.out.println("Nenhuma nota válida foi inserida.");
            }

        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }
    }
}
