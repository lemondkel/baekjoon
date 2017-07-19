import java.util.Scanner;

public class p5523 {
	/**
	 * l2jong insedu (2017-07-19)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aWin = 0;
		int bWin = 0;

		int caseCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < caseCount; i++) {
			String str = sc.nextLine();
			String[] temp = str.split(" ");

			int aScore = Integer.parseInt(temp[0]);
			int bScore = Integer.parseInt(temp[1]);

			if (aScore > bScore)
				aWin++;
			else if (aScore < bScore)
				bWin++;
		}

		System.out.println(aWin + " " + bWin);
	}
}