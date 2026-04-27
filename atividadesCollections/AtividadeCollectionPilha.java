package atividadesCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AtividadeCollectionPilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);

		int contador;
		int codigo;
		String nome;

		do {
			System.out.println("\n========== PILHA DE LIVROS ==========");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção: ");

			codigo = leia.nextInt();
			leia.nextLine();

			switch (codigo) {

			case 1:
				System.out.print("Digite o nome do livro: ");
				nome = leia.nextLine();

				pilha.push(nome);

				System.out.println("Livro adicionado!");
				System.out.println("Pilha atualizada: " + pilha);
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("\nElementos da Pilha (topo → base):");

					contador = pilha.size();

					for (String livro : pilha) {
						System.out.printf("[%d] %s%n", contador, livro);
						contador--;
					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Livro retirado: " + pilha.pop());
					System.out.println("Pilha atualizada: " + pilha);
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (codigo != 0);

		leia.close();

	}

}
