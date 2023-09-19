package teste;

import java.util.Scanner;
import java.util.*;

public class prova2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            String stop = "n";

            // Usar um mapa para rastrear a quantidade e o tipo por espécie
            Map<String, Integer> quantidadePorEspecie = new HashMap<>();
            Map<String, String> tipoPorEspecie = new HashMap<>();

            while (stop.equals("n")) {
                System.out.println("Qual seria a espécie do percevejo?");
                String especie = scanner.nextLine();

                System.out.println("Qual seria a quantidade do percevejo?");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.println("Qual seria o tipo da espécie?");
                System.out.println("t - Terrestre");
                System.out.println("a - Aquático");
                System.out.println("s - Semiaquático");
                String tipo = scanner.nextLine();

                // Atualizar o mapa com a quantidade e o tipo por espécie
                quantidadePorEspecie.put(especie, quantidadePorEspecie.getOrDefault(especie, 0) + quantidade);
                tipoPorEspecie.put(especie, tipo);

                System.out.println("Deseja parar o programa? s/n");
                stop = scanner.nextLine();
            }

            // Exibir os detalhes para cada espécie
            for (Map.Entry<String, Integer> entry : quantidadePorEspecie.entrySet()) {
                String especie = entry.getKey();
                int quantidade = entry.getValue();
                String tipo = tipoPorEspecie.get(especie);
                System.out.println("A espécie " + especie + " tem em quantidade " + quantidade + " percevejos, e eles são " + tipo + ".");
            }

            // Encontrar o tipo com a maior quantidade
            Map<String, Integer> quantidadePorTipo = new HashMap<>();
            for (String especie : quantidadePorEspecie.keySet()) {
                String tipo = tipoPorEspecie.get(especie);
                int quantidade = quantidadePorEspecie.get(especie);
                quantidadePorTipo.put(tipo, quantidadePorTipo.getOrDefault(tipo, 0) + quantidade);
            }

            String tipoComMaiorQuantidade = Collections.max(quantidadePorTipo.entrySet(), Map.Entry.comparingByValue()).getKey();

            System.out.println("O tipo de percevejo em maior quantidade é o " + tipoComMaiorQuantidade + ".");
        } catch (NumberFormatException e) {
            System.out.println("Erro, valor invalido.");
            e.printStackTrace();
        }
    }
}

