package atividades2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println("- O número é par");
		}else {
			System.out.println("- O número é ímpar");
		}

		if(numero > 0) {
		System.out.println("- O número é postivo");
	}else if(numero < 0) {
		System.out.println("- O número é negativo");
		}else {
			System.out.println("- O número é zero");
		}
	}
}
