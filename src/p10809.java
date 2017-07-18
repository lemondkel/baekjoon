import java.util.Scanner;

public class p10809 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] whereIsAlphabet = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			int result = (int) c - 97;

			switch (result) {
				default:
					if (whereIsAlphabet[result] == -1)
						whereIsAlphabet[result] = i >= whereIsAlphabet[result] ? i : whereIsAlphabet[result];
					break;
			}
		}

		for (int i = 0; i < whereIsAlphabet.length; i++) {
			System.out.print(whereIsAlphabet[i] + " ");
		}
	}
}