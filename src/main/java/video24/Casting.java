package video24;

public class Casting {
	public static void main(String[] args) {
//		exemplo3();
		
//		exemplo4_catingDouble();
		
		double a;
		int b;
		
		a = 5.0;
		b = (int)a;
		
		System.out.println(b);
		
			
	}

	private static void exemplo4_catingDouble() {
		int a, b;
		
		double resultado;
		
		a = 170; 
		b = 100;
		
//		resultado = a / b; // divisão entre números inteiro resulta em um número inteiro truncado quando necessário
		resultado = (double) a / b;
		
		System.out.println(resultado);
	}

	private static void exemplo3() {
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
	}

}
