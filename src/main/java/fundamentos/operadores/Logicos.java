package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // V and F = F
		System.out.println(condicao1 || condicao2); // V or  F = V
		System.out.println(condicao1 ^ condicao2); // V xor  F = V
		System.out.println(!condicao1); // not V = F
		System.out.println(!condicao2); // not F = V
	}

}
