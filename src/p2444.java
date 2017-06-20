import java.util.Scanner;

public class p2444 {
	/**
	 * l2jong insedu (2017-06-20)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int x = 0; x < count; x++) {
			for (int i = count - 1; i > x; i--) {
				System.out.print(" ");
			}
			for (int i = 0; i < ((x + 1) * 2) - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int x = count - 1; x > 0; x--) {
			for (int i = count; i > x; i--) {
				System.out.print(" ");
			}

			for (int i = 0; i < (x * 2) - 1; i++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}