package liçãodeCasa15ao23;

import java.util.Scanner;

public class Lição21 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in );


		System.out.println("Entre com o primerio número");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número");
		int num3 = scan.nextInt();
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("num1 é menor: " + num1);
			
		}else if (num2 <= num1 && num2 <= num3) {
				System.out.println("num2 é menor: " + num3);
				
		}else if (num3 <= num1 && num3 <= num2) {
			System.out.println("num3 é menor: " + num3);
			

		}
	}

}
