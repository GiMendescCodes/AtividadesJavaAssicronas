package atividades2;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		float numeroA, numeroB, numeroC, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextFloat();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextFloat();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextFloat();
		
		resultado = numeroA + numeroB;
		
		if(resultado > numeroC) {
			System.out.println("- Resultado da soma de A e B: " + resultado + "\n- A Soma de A + B é Maior do que C");
		}else if(resultado == numeroC){
			System.out.println("- Resultado da soma de A e B: " + resultado + "\n- A Soma de A + B é Igual a C");
		}else {
			System.out.println("- Resultado da soma de A e B: " + resultado + "\n- A Soma de A + B é Menor do que C");
		}

	}

}
