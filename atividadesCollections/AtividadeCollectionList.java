package atividadesCollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AtividadeCollectionList {
public static void main(String[] args) {
		
	 ArrayList<String> cores = new ArrayList<>();
     int contador;
     Scanner leia = new Scanner(System.in);

     for (contador = 1; contador < 6; contador++) {

         System.out.println("Digite a " + contador + "º cor: ");
         cores.add(leia.nextLine()); // ✔ adiciona na lista

     }

     System.out.println("\nCores listadas: " + cores);

     Collections.sort(cores); // ✔ ordena a lista

     System.out.println("Cores em ordem: " + cores);

	}
}