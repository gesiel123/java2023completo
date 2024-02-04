package fundamentos.operadores;

public class Desafiologicosresolucao {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)

		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean vidaMaisSaudavel = !comprouSorvete;
		System.out.println("comprou tv 50\"? " + comprouTV50);
		System.out.println("comprou tv 32\"? " + comprouTV32);
		System.out.println("comprou sorvete? " + comprouSorvete);
		System.out.println("vida mais saudavel? " + vidaMaisSaudavel);

	} 

}
