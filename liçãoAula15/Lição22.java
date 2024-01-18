package liçãoAula15;

import java.util.Scanner;

public class Lição22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in );

		System.out.println("Entre com a quantidade  (kg) de morango");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade  (kg) de maça");
		double qtdMaça = scan.nextDouble();
		
		double precoKgMorango = 0;
		if(qtdMorango <= 5) {
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}

		double precoKgMaça = 0;
		if(qtdMaça <= 5) {
			precoKgMaça = 1.8;
		}else {
			precoKgMaça = 1.5;
			
			
			double precoTotalMorango = qtdMorango * precoKgMorango;
			double precoTotalMaça = qtdMaça * precoKgMaça;
			
		double precoParcial =  precoKgMaça + precoKgMorango;
		double precoTotal = precoParcial;
		
		if((qtdMorango + qtdMaça > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
			
			
			
			
		}
			
		System.out.println("Preço Total = " + precoTotal);
		
		
		}
		
	}

}
