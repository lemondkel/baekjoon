import java.util.Scanner;

/**
 * Created by l2jong on 2017-05-08.
 */
public class p2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		String[] result = new String[count];

		for (int i = 0; i < count; i++) {
			int cash = sc.nextInt();

			int quarter, dime, nickel, penny;

			quarter = cash / 25;
			cash %= 25;

			dime = cash / 10;
			cash %= 10;

			nickel = cash / 5;
			cash %= 5;

			penny = cash / 1;
			cash %= 1;

			result[i] = quarter + " " + dime + " " + nickel + " " + penny;
		}

		for (int j = 0; j < count; j++)
			System.out.println(result[j]);
	}
}
