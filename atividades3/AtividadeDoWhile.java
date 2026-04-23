package atividades3;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		int num, resultado = 0, temp = 0;
		Scanner leia = new Scanner(System.in);

		do {
			
			System.out.println("\nDigite um número(0 para sair): ");
			num = leia.nextInt();
			
			if(num > 0) {
				resultado = temp + num;
				temp = resultado;
				}

			System.out.println("\n- A soma dos números positivos é " + resultado);

		} while (num != 0);
		
	}

}
