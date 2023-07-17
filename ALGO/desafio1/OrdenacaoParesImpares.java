package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Big O(n log n)
public class OrdenacaoParesImpares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de valores a serem ordenados:");
		int n = scanner.nextInt();

		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		System.out.println("Digite os valores:");

		for (int i = 0; i < n; i++) {
			int valor = scanner.nextInt();
			if (valor % 2 == 0) {
				pares.add(valor);
			} else {
				impares.add(valor);
			}
		}
		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());
		
		System.out.println("Valores ordenados:");
		for (int par : pares) {
			System.out.println(par);
		}
		for (int impar : impares) {
			System.out.println(impar);
		}

		scanner.close();
	}
}