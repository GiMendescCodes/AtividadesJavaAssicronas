package atividades3;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {

        int contador, num;
        int par = 0, impar = 0;
        Scanner leia = new Scanner(System.in);

        for (contador = 1; contador <= 10; contador++) {

            System.out.println("Digite o " + contador + "º número: ");
            num = leia.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);

        leia.close();

	}

}
