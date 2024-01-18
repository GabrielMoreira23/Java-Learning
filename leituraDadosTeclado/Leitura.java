package leituraDadosTeclado;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);	

	System.out.println("Digite seu nome completo: ");
	String nomeCompleto = scan.nextLine();
	System.out.println("Seu nome completo é: " + nomeCompleto);
	
	System.out.println("Digite seu primerio nome: ");
	String primeiroNome = scan.next();
	System.out.println("Seu primeiro nome é: " + primeiroNome);
	
	System.out.println("Digite a sua idade:");
	int idade = scan.nextInt();
	System.out.println("Sua idade é: " + idade);
	
	System.out.println("Digite a sua altura:");
	double altura = scan.nextDouble();
	System.out.println("A sua altura é:" + altura);
	
	System.out.println("Digite o seu primerio nome, idade, quantidade de filhos, altura e se tem bixiinho de estimação");
	String primeiroNome1 = scan.next();
	int idade1 = scan.nextInt();
	byte qtdFilhos = scan.nextByte();
	float altura1 = scan.nextFloat();
	boolean temPet = scan.nextBoolean();
	
	System.out.println("Você digitou os sgeuintes valores:");
	System.out.println("Primeiro nome: " + primeiroNome1);
	System.out.println("Idade: " + idade1);
	System.out.println(" Quantidade de filhos: " + qtdFilhos);
	System.out.println("Altura: " + altura1);
	System.out.println("Tem bicinho de estimação? " + temPet);
	
	
	}

}
