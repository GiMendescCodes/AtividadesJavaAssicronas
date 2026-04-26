package atividadesCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeCollectionsSet {

	public static void main(String[] args) {

        Set<Integer> setNum = new HashSet<>();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        while (setNum.size() < 10) {
            int num = leia.nextInt();

            if (setNum.contains(num)) {
                System.out.println("Número repetido! Digite outro:");
            } else {
                setNum.add(num);
            }
        }

        System.out.println("\nDados da Collection:");

        Iterator<Integer> isetNum = setNum.iterator();

        while (isetNum.hasNext()) {
            System.out.println(isetNum.next());
        }

	}
}