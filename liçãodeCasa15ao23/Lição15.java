package liçãodeCasa15ao23;

import java.util.Scanner;

public class Lição15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in );
		
		System.out.println("Entre com o primeiro número");
		int num1 = scan.nextInt();
		

		System.out.println("Entre com o segundo número");
		int num2 = scan.nextInt();

		
		if (num1 > num2) {
			System.out.println("O primerio número é maior: " + num1);
			
		}else {
				System.out.println("O segundo número 2 é maior: " + num2);
				
			}
		}
		
	}


