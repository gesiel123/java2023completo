package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		byte primitivo_b = 100;
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
//		Integer i = Integer.parseInt("10000");
//		Integer i = Integer.parseInt(entrada.next());
		Long l = 100000L;
//		l = i.longValue();
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
//		System.out.println("1000" + 1);
//		System.out.println(1000 + 1);
		
		Float f = 123.10F;
		System.out.println("Número float: " + f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("truE");
//		bo = true;
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //tipo primitovo char
		System.out.println(c + ".....");
		
//		primitivo_b. // não compila, erro de codificação
		
//		entrada.close();
	}

}
