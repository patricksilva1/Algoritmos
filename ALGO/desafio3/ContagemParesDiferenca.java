package desafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemParesDiferenca {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de elementos no array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Digite os elementos do array:");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Digite o valor alvo:");
		int k = scanner.nextInt();

		int paresDiferenca = contarParesDiferenca(arr, k);
		System.out.println("Número de pares com diferença igual a " + k + ": " + paresDiferenca);

		scanner.close();
	}

	public static int contarParesDiferenca(int[] arr, int k) {
		// Criar um map para armazenar a contagem de cada elemento do array.
		Map<Integer, Integer> countMap = new HashMap<>();
		// Contar a ocorrência de cada elemento do array.
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		int count = 0;

		// Verificar a diferença entre cada elemento e o valor alvo
		for (int num : arr) {
			int diff = num - k;

			// Se a diferença existir no map e for diferente de zero, incrementar a contagem.
			if (countMap.containsKey(diff) && countMap.get(diff) > 0) {
				count++;
			}
			// Se o valor atual tiver uma ocorrência no map, decrementar sua contagem.
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) - 1);
			}
		}

		return count;
	}
}