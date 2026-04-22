package atividades2;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		 int codigo;
	        float salario = 0, salarioNovo = 0, reajuste = 0;
	        String nome = "";
			Scanner leia = new Scanner(System.in);

			System.out.println("\n-Digite o seu nome: ");
			nome = leia.nextLine();
			System.out.println("\n-Digite o código do seu cargo: ");
			codigo = leia.nextInt();
			System.out.println("\n-Digite o seu sálario atual: ");
			salario = leia.nextFloat();
			
			
			switch (codigo) {
			case 1:
				System.out.println("Cargo: Gerente");
				reajuste = 0.10f;
				break;
			case 2:
				System.out.println("Cargo: Vendedor");
				reajuste = 0.07f;
				break;
			case 3:
				System.out.println("Cargo: Surpevisor");
				reajuste = 0.09f;
				break;
			case 4:
				System.out.println("Cargo: Motorista");
				reajuste = 0.06f;
				break;
			case 5:
				System.out.println("Cargo: Estoquista");
				reajuste = 0.05f;
				break;
			case 6:
				System.out.println("Cargo: Tecnico de TI");
				reajuste = 0.08f;
				break;
			default:
				System.out.println("Código inválida!");
				return;
			}
			
			salarioNovo = salario + (reajuste * salario);
			
	        System.out.printf("Nome: " + nome+ "\nNovo sálario: R$ " +  salarioNovo);

	}

}
