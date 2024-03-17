package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		// Operador ternário "? :"
		// booleano(operando1) ? operando2 : operando3
		
		//double media = 7.6;
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação";
		
//Código alternativo		
//		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
//		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
//Código alternativo		
//		String resultadoFinal = media >= 7.0 ? "aprovado." : media >= 5.0 ? "em recuperação." : "reprovado.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s ", resultado);
		
		
//		String resultadoSemestral = media >= 6.5 ? "aprovado no semestre" : "reprovado no semestre";
//		System.out.println("O aluno no semestre está " + resultadoSemestral);
	}
}
