package liçãoAula15;

import java.util.Scanner;

public class Lição10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in );

		System.out.println("Em qual turno você estuda?");
		String turno = scan.next();
		
		switch(turno){
		case "manhã":
		case "MANHÃ": System.out.println("Bom dia!"); break;
		case "vespertino":
		case "VESPERTINO": System.out.println("Bom tarde!"); break;
		case "noite":
		case "NOITE": System.out.println("Bom noite!"); break;
		default: System.out.println("Valor inválido!");
			
		
		}
				
		
		
	}

}
