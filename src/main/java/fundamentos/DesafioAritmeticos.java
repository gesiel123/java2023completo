package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
		
		
		double numerador_Fracao1 = Math.pow((6*(3+2)), 2);
		double denominador_Fracao1 = 3 * 2;
		double resultado_Fracao1 = numerador_Fracao1 / denominador_Fracao1;
		double resultado_termo1 = resultado_Fracao1;
		System.out.println(resultado_termo1);
		
		double numerador_Fracao2 = (1-5)*(2-7);
		double denominador_Fracao2 = 2;
		double resultado_Fracao2 = numerador_Fracao2 / denominador_Fracao2;
		double resultado_termo2 = Math.pow(resultado_Fracao2, 2);
		System.out.println(resultado_termo2);
		
		double numerador_Fracao3 = Math.pow((resultado_termo1 - resultado_termo2), 3);
		double denominador_Fracao3 = Math.pow(10, 3);
		double resultado_Fracao3 = numerador_Fracao3 / denominador_Fracao3;
		double resultado_termo3 = (int)resultado_Fracao3;
		int resultado_termo3_int = (int) resultado_Fracao3;
		System.out.println(resultado_termo3);
		System.out.println(resultado_termo3_int);
		
	}
}
