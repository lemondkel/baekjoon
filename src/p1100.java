import java.util.Scanner;

public class p1100 {
	/**
	 * l2jong insedu (2017-06-20)
	 */

	private static int whiteCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			String str = sc.nextLine();

			for (int j = 0; j < str.length(); j++) {
				char result = str.charAt(j);

				if (i % 2 == 0 && j % 2 == 0) {
					searchWhite(result);
				} else if (i % 2 == 1 && j % 2 == 1) {
					searchWhite(result);
				}
			}
		}

		System.out.println(whiteCount);
	}

	private static void searchWhite(char result) {
		switch (result) {
			case 'F':
				whiteCount++;
				break;
		}
	}
}