package desafio4;

import java.util.Scanner;

public class DesembaralharString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de casos de teste:");
		int n = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digite as linhas a serem desembaralhadas (uma por linha):");

		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			String decifrada = desembaralhar(line);
			System.out.println();
			System.out.print("Linha decifrada:");
			System.out.println(decifrada);
			if(i < n - i) {
				System.out.println("Próxima Linha:");
			}
			System.out.println();
		}

		scanner.close();
	}

	public static String desembaralhar(String str) {
		int length = str.length();
		StringBuilder sb = new StringBuilder(length);
		for (int i = length / 2 - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		for (int i = length - 1; i >= length / 2; i--) {
			sb.append(str.charAt(i));
		}

		return sb.toString();
	}
}