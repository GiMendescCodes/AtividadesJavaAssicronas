package atividades1;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	

		//Variaveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.printf("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.printf("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.printf("Horas Extras: ");
		horasExtras= leia.nextFloat();
		
		System.out.printf("Descontos: ");
		descontos = leia.nextFloat();
		
		//Processamento
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5 ) - descontos;
		
		//Saída
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}
