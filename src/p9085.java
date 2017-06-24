import java.util.Scanner;

public class p9085 {
	/**
	 * l2jong insedu (2017-06-20)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < count; i++) {
			int tempLength = sc.nextInt();

			sc.nextLine();

			String str = sc.nextLine();

			String[] result = str.split(" ");

			int input = 0;
			for (int j = 0; j < tempLength; j++) {
				input += Integer.parseInt(result[j]);
			}

			System.out.println(input);
		}
	}
}