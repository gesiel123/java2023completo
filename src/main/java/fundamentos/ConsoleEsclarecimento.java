package fundamentos;

import java.util.Scanner;

public class ConsoleEsclarecimento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();// Irá ler o caractere "\n" do número digitado acima
		System.out.print("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.print("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		
		System.out.println("Conteúdo a variável nome: " + nome);;
		System.out.println("Conteúdo a variável sobrenome: " + sobrenome);;
		System.out.println("Conteúdo a variável idade: " + idade);;
		
		teclado.close();
		
	}

}
