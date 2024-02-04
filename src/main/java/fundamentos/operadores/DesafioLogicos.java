package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		// Situação 01: Vou trabalhar na terça e na quinta então compro TV de 50 e tomar sorvete"
		//trabalho1 = true;
		//trabalho2 = true;
		
		// Situação 02: Vou trabalhar na terça ou quinta então compro TV de 32 e tomar sorvete"
		// Situação 02 - Variação 01;
		//   trabalho1 = false;
		//   trabalho2 = true;
		// Situação 02 - Variação 02;
		//   trabalho1 = true;
		//   trabalho2 = false;
		
		// Situação 03: Não vou trabalhar na terça e não vou trabalhar na quinta então não compro TV nenhuma e não tomar sorvete"
		trabalho1 = false;
		trabalho2 = false;
		
		if(trabalho1 && trabalho2) {
			System.out.println("Família comprou TV de 50\" e tomou sorvete");
		}
		if(trabalho1 ^ trabalho2) {
			System.out.println("Família comprou TV de 32\" e tomou sorvete");
		}
		if(!trabalho1 && !trabalho2) {
			System.out.println("Família não comprou TV nem tomou sorvete");
		}
	}

}
