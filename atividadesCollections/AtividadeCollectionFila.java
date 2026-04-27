package atividadesCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeCollectionFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		int codigo;
		String nome;

		do {
			System.out.println("\n========== SISTEMA DE FILA ==========");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção: ");

			codigo = leia.nextInt();
			leia.nextLine();

			// adicionar novo cliente na fila
			switch (codigo) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);

				System.out.println("Cliente adicionado!");
				System.out.println("Fila atualizada: " + fila);
				break;

			// mostrar fila
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Clientes na fila: " + fila);
				}
				break;

			// remove cleinte da fila(chama o cliente)
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Cliente chamado: " + fila.remove());
					System.out.println("Fila atualizada: " + fila);
				}
				break;

			// anuncio finalização do programa
			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

			// matem rodando ate usuario digitar o 0
		} while (codigo != 0);

		// fechar scanner
		leia.close();

	}

}
