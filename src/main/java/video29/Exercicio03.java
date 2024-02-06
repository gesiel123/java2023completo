package video29;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Programa para calcular o resultado da fórmula (A * B - C * D)");
		double A, B, C, D;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.printf("25%% da fórmula preenchida ==> (%.2f * B - C * D)\n", A);
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.printf("50%% da fórmula preenchida ==> (%.2f * %.2f - C * D)\n", A, B);
		
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();
		System.out.printf("75%% da fórmula preenchida ==> (%.2f * %.2f - %.2f * D)\n", A, B, C);
		
		System.out.print("Digite o valor de D: ");
		D = sc.nextDouble();
		System.out.printf("100%% da fórmula preenchida ==> (%.2f * %.2f - %.2f * %.2f)\n", A, B, C, D);
		System.out.printf("O resultado é: %f", A * B - C * D );
		
		
		sc.close();
		
		
	}

}
