import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n",x); // %n é o a quebra de linha.
		System.out.printf("%.4f\n",x); // \n pode ser usado também para quebra de linha.
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n",x); 
		System.out.println("RESULTADO = " + x + " METROS"); 
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);
		
//		System.out.print("Olá Mundo!");
		System.out.println("Bom dia!");

	}

}