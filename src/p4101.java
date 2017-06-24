import java.util.Scanner;

public class p4101 {
	/**
	 * l2jong insedu (2017-06-20)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;

		do {
			String str = sc.nextLine();

			String[] temp = str.split(" ");

			x = Integer.parseInt(temp[0]);
			y = Integer.parseInt(temp[1]);

			if (x != 0 && y != 0) {
				if (x > y)
					System.out.println("Yes");
				else
					System.out.println("No");
			}

		} while (x != 0 && y != 0);
	}
}