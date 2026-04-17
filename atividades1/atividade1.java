package atividades1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
			
			//Variaveis
			double salario, abono, novoSalario;
			Scanner leia = new Scanner(System.in);
			
			//Entrada de dados
			System.out.println("Digite o salário: ");
			salario = leia.nextFloat();
			
			System.out.println("Digite o abono: ");
			abono = leia.nextFloat();
			
			//Processamento
			novoSalario = salario + abono;
			
			//Saída
			System.out.println("O novo salário é: " + novoSalario);

	}

}
