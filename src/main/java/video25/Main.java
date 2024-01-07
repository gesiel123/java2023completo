package video25;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Configuração dos formatos padrões do sistema
		Scanner sc = new Scanner(System.in);
		
//		le_string(sc);
		
//		le_inteiro(sc);
		
//		le_double(sc);
		
//		le_char(sc);
		
		String x;
		int y;
		double z;
		System.out.println("Digite três dados na mesma linha sendo; string, int e double");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
	
		
	}

	private static void le_char(Scanner sc) {
		char x;
		System.out.print("Digite um número caracter: ");
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
	}

	private static void le_double(Scanner sc) {
		double x;
		
		System.out.print("Digite um número decimal: ");
		x = sc.nextDouble(); // Digitação do número decimal com o formato padrão do sistema
		System.out.println("Voce digitou:" + x); // Saida do número com o padrão dos US
		System.out.printf("Voce digitou: %.2f", x); // Saida do número com o formato padrão do Sistema
	}

	private static void le_inteiro(Scanner sc) {
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		System.out.println("Voce digitou:" + x);
	}

	private static void le_string(Scanner sc) {
		String x;
		x = sc.next(); // Lê somente um token
		System.out.println("Você digitou: " + x);
		
	}

}
