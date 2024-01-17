package video29;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para somar dois inteiros");
		System.out.print("Digite o primeiro numero :");
		int int1 = sc.nextInt();
		System.out.print("Digite o segundo numero :");
		int int2 = sc.nextInt();
		
		System.out.print("A soma é :" + (int1 + int2));
		
		sc.close();
	}

}
