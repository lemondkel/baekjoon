import java.util.Scanner;

public class p2744 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			String temp;
			char c = str.charAt(i);

			if (Character.isLowerCase(c))
				temp = Character.toString(c).toUpperCase();
			else
				temp = Character.toString(c).toLowerCase();

			stringBuilder.append(temp);
		}

		System.out.println(stringBuilder.toString());
	}
}