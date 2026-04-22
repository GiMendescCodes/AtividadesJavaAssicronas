package atividades2;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
        int codigo, quantidade;
        double valorUnitario = 0, valorTotal = 0;
        String produto = "";
		Scanner leia = new Scanner(System.in);

		System.out.println("CAIXA");
		System.out.println("\n-Digite o código do produto: ");
		codigo = leia.nextInt();
		System.out.println("\n-Digite a quantidade de produto: ");
		quantidade = leia.nextInt();
		
		
		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			valorUnitario = 10.00;
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			valorUnitario = 15.00;
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valorUnitario = 18.00;
			break;
		case 4:
			System.out.println("Produto: Bauru");
			valorUnitario = 12.00;
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valorUnitario = 8.00;
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			valorUnitario = 13.00;
			break;
		default:
			System.out.println("Opção inválida!");
			return;
		}
		
		valorTotal = valorUnitario * quantidade;
		
        System.out.printf("Valor total: R$ " +  valorTotal);
		
	}

}
