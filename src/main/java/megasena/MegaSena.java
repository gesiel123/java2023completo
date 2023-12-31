package megasena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MegaSena {
    public static void main(String[] args) {
        // Sua aposta
//        List<Integer> aposta = Arrays.asList(7, 4, 35, 16, 46, 54, 12); // Já sorteado
    	
//        List<Integer> aposta = Arrays.asList(10, 53, 48, 22, 41, 4); // Angelo
//        List<Integer> aposta = Arrays.asList(7, 11, 20, 34, 43, 52); // Leila
//        List<Integer> aposta = Arrays.asList(9, 10, 18, 19, 45, 54); // Leila2
        List<Integer> aposta = Arrays.asList(14, 23, 33, 42, 50, 60); // Leila3
//        List<Integer> aposta = Arrays.asList(8, 34, 19, 51, 12, 36); // Hyago
//        List<Integer> aposta = Arrays.asList(8, 15, 26, 35, 44, 58); // Davy
        
        // Lista de todos os sorteios anteriores
        List<List<Integer>> sorteiosAnteriores = new ArrayList<List<Integer>>();
//        List<List<Integer>> sorteiosAnteriores = Arrays.asList(
//        		Arrays.asList(1, 2, 3, 4, 5, 6),
//        		Arrays.asList(7, 14, 21, 28, 35, 42),
//        		Arrays.asList(8, 15, 22, 29, 36, 43)
//        		// adicione mais sorteios aqui
//        		);
        
        try (BufferedReader br = new BufferedReader(new FileReader("sorteios.txt"))) {
            String sorteio;
            while ((sorteio = br.readLine()) != null) {
            	String[] split =  sorteio.split(";");
            	List<Integer> listIn = new ArrayList<Integer>();
            	for (String strNr : split) {
            		int nr = Integer.parseInt(strNr);
					listIn.add(nr);
				}
            	sorteiosAnteriores.add(listIn);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        for (List<Integer> sorteio : sorteiosAnteriores) {
            if (aposta.containsAll(sorteio)) {
                System.out.println("Sua aposta JÁ FOI sorteada!");
                return;
            }
        }

        System.out.println("Sua aposta NUNCA FOI sorteada.");
    }
}
