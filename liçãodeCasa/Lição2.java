package liçãodeCasa;

import java.util.Scanner;

public class Lição2 {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("Entre com um número inteiro:");
		int numero = scan.nextInt();
		System.out.println("O número informado foi: " + numero);
		
		
	}

}
