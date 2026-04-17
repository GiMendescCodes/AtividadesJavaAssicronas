package atividades1;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		
		//Variaveis
		float numero1, numero2, numero3, numero4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.printf("Número 1: ");
		numero1 = leia.nextFloat();
		
		System.out.printf("Número 2: ");
		numero2 = leia.nextFloat();
		
		System.out.printf("Número 3: ");
		numero3 = leia.nextFloat();
		
		System.out.printf("Número 4: ");
		numero4 = leia.nextFloat();
		
		//Processamento
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		//Saída
		System.out.println("A diferença é: " + diferenca);

	}

}
