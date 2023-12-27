package megasena;

import java.util.Arrays;
import java.util.List;

public class MegaSena {
    public static void main(String[] args) {
        // Sua aposta
        List<Integer> aposta = Arrays.asList(7, 14, 21, 35, 42, 28);

        // Lista de todos os sorteios anteriores
        List<List<Integer>> sorteiosAnteriores = Arrays.asList(
            Arrays.asList(1, 2, 3, 4, 5, 6),
            Arrays.asList(7, 14, 21, 28, 35, 42),
            Arrays.asList(8, 15, 22, 29, 36, 43)
            // adicione mais sorteios aqui
        );

        for (List<Integer> sorteio : sorteiosAnteriores) {
            if (sorteio.containsAll(aposta)) {
                System.out.println("Sua aposta já foi sorteada!");
                return;
            }
        }

        System.out.println("Sua aposta ainda não foi sorteada.");
    }
}
