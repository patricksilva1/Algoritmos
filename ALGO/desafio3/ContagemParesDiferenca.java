package desafio3;

import java.util.Arrays;
import java.util.Scanner;

// Big O(n log n)
public class ContagemParesDiferenca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o tamanho do array (n): ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Digite os elementos do array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("Digite o valor alvo (k): ");
		int k = scanner.nextInt();

		int count = countPairsWithDifference(arr, k);
		System.out.println("O número de pares que satisfazem o critério é: " + count);

		scanner.close();
	}

	public static int countPairsWithDifference(int[] arr, int k) {
		Arrays.sort(arr);
		int count = 0;
		int i = 0;
		int j = 1;

		while (j < arr.length) {
			int diff = arr[j] - arr[i];

			if (diff == k) {
				count++;
				j++;
			} else if (diff > k) {
				i++;
			} else {
				j++;
			}
		}

		return count;
	}
}