package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;//conversao implicita 
		//double a = 1.123456788888;
		System.out.println(a);
		
		float b = (float) 1.123456788888;//conversao explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		//int c = 340;//Será um número transformado pelo byte
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int)e;//explícita (CAST);
		System.out.println(f);
		
				
		
	}

}
