import java.util.Scanner;

public class p11006 {
	/**
	 * l2jong insedu (2017-07-19)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int caseCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < caseCount; i++) {
			String temp = sc.nextLine();

			String[] result = temp.split(" ");
			int legCount = Integer.parseInt(result[0]);
			int chickenCount = Integer.parseInt(result[1]);

			int badChicken = (chickenCount * 2) - legCount;
			int goodChicken = chickenCount - badChicken;

			System.out.println(badChicken + " " + goodChicken);
		}
	}
}