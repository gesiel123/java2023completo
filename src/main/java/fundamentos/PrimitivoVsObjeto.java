package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
//		System.out.println(s); // gera erro de compilação pois a variáveis não está definida ainda.
		String s = null;
		System.out.println(s);
		s = new String ("texto");
		System.out.println(s);
		String s2= "texto2";
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos 
		//primitivos
		int a = 123;
		//System.out.println(a);
		//System.out.println(s2);
	}

}
