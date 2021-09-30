package hackerRank_Ex3;

import java.util.Scanner;

public class EntradaSaidaScanner2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
/*
 * Para utilização correta do buffer, quando existe a necessidade de realizar
 * uma entrada consecutiva de dados numéricos e cadeias de caracteres, deve-se
 * esvaziar o buffer depois da leitura do valor numérico e antes da leitura de
 * um valor do tipo String
 */