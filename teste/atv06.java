package teste;

import java.util.*;

public class atv06 {
    public static void main(String[] args) {
        
        // Criar um HashMap (implementação de Map)
        Map<String, Integer> mapa = new HashMap<>();

        // Inserir pares chave-valor
        mapa.put("Chave1", 10);
        mapa.put("Chave2", 20);
        mapa.put("Chave3", 30);

        // Recuperar valores por chave
        int valor = mapa.get("Chave2");
        System.out.println("Valor associado à Chave2: " + valor);

        // Iterar sobre as chaves e os valores
        for (String chave : mapa.keySet()) {
            int valorChave = mapa.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valorChave);
        }
    }
}

