package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println("valor de c: " + c);
		
		//c += b; //c = c + b;
		//System.out.println("valor de c: " + c);

		//c -= a; //c = c - a;
		//System.out.println("valor de c: " + c);
		
		//c *= b; //c = c * b;
		//System.out.println("valor de c: " + c);
		
		//c /= a; //c = c / a;
		//System.out.println("valor de c: " + c);
		
		c %= 2; // c = c % 2
		System.out.println("valor de c: " + c);
	}

}
