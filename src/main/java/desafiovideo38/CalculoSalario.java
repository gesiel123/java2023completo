package desafiovideo38;

	import java.util.Scanner;

	public class CalculoSalario {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Programa para calcular média de três salários");
			System.out.print("Digite o primeiro salário recebido: ");
			String salario1 = entrada.nextLine().replace(',', '.');
			double salarioDouble1 = Double.parseDouble(salario1);
			System.out.print("Digite o segundo salário recebido: ");
			String salario2 = entrada.nextLine().replace(',', '.');
			double salarioDouble2 = Double.parseDouble(salario2);
			System.out.print("Digite o terceiro salário recebido: ");
			String salario3 = entrada.nextLine().replace(',', '.');
			double salarioDouble3 = Double.parseDouble(salario3);
			
			System.out.println("A média dos salários é: " + (salarioDouble1 + salarioDouble2 + salarioDouble3)/3);
		}
	}


