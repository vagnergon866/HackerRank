package loops1;

import java.util.Scanner;

public class JavaEnd_Of_File {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (str.contains("end-of-file")) {
				i++;
				System.out.println(i + " " + str);
				break;
			} else {
				i++;
				System.out.println(i + " " + str);
			}
		}
	}
}
