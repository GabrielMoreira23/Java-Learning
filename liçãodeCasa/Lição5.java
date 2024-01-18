package liçãodeCasa;

import java.util.Scanner;

public class Lição5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros = scan.nextDouble();
		
		//2m = 100cm
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a " + cm + " cm");
		

	}

}
