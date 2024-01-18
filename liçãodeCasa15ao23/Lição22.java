package liçãodeCasa15ao23;

import java.util.Scanner;

public class Lição22 {

public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in );


		System.out.println("Entre com o primerio preço");
		double preço1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo preço");
		double preço2 = scan.nextDouble();
		
		System.out.println("Entre com o terceiro preço");
		double preço3 = scan.nextDouble();
		
		
		if (preço1 <= preço2 && preço1 <= preço3) {
			System.out.println("Compre o produto 1: " + preço1);
			
		}else if (preço2 <= preço1 && preço2 <= preço3) {
				System.out.println("Compre o produto 2: " + preço3);
				
		}else if (preço3 <= preço1 && preço3 <= preço2) {
			System.out.println("Compre o produto 3: " + preço3);
			

		}
	}

}

