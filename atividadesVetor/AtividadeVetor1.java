package atividadesVetor;

import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//variaveis
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		boolean encontrado = false; //Variável de controle para saber se o número foi encontrado ou não

		//entrada do numero escolhido pelo úsuario
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		//Laço de repetição que percorre todas as posições do vetor
		for (int posicao = 0; posicao < vetorNumeros.length; posicao++) {

			//identifica se o número escolhido pelo usuario é uma das opções e ja responde sua posição
			if (vetorNumeros[posicao] == numero) {
				System.out.println("O número " + numero + " está na posição " + posicao);
				encontrado = true;
			}
		}

		//identifica que númemero escolhido não era uma das opções e mostra resposta
		if (!encontrado) {
			System.out.println("O número "+ numero + " não foi encontrado!");
		}
	}

}
