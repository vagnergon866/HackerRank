package Java_If_Else;

import java.util.Scanner;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int resto;
		resto = n % 2;
        
		if (n >= 1 && n <= 5 && (resto == 0)) {
			System.out.println("Not Weird");
		} else if (n >= 6 && n <= 20 && (resto == 0)) {
			System.out.println("Not Weird");
		} else if (n > 20 && n <= 100 && (resto == 0)) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}

		scanner.close();
	}
}
