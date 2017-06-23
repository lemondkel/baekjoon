import java.util.Scanner;

public class p2475 {
	/**
	 * l2jong insedu (2017-06-23)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] temp = str.split(" ");
		int[] result = new int[5];

		for (int i = 0; i < result.length; i++)
			result[i] = Integer.parseInt(temp[i]);

		int total = 0;

		for (int i = 0; i < result.length; i++) {
			int score;

			score = result[i] * result[i];

			total += score;
		}

		int last = total % 10;

		System.out.println(last);
	}
}