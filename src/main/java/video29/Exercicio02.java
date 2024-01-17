package video29;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		double pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para calcular a área de um círculo");
		System.out.print("Digite o raio do cículo :");
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2); 
		System.out.printf("A área do círculo é de : %.4f", area);
		
		sc.close();
	}

}
