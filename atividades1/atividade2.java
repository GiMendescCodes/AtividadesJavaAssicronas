package atividades1;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	

		//Variaveis
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.printf("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.printf("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.printf("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.printf("Digite a nota 4: ");
		nota4 = leia.nextFloat();
		
		//Processamento
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Saída
		System.out.println("A sua média foi de: " + media);
		
	}

}
