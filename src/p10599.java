import java.util.Scanner;

public class p10599 {
	/**
	 * l2jong insedu (2017-07-19)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();

			String[] temp = str.split(" ");

			if (temp[0].equals("0") && temp[1].equals("0") && temp[2].equals("0") && temp[3].equals("0")) {
				break;
			}

			int min2 = Integer.parseInt(temp[0]) <= Integer.parseInt(temp[1]) ? Integer.parseInt(temp[0]) : Integer.parseInt(temp[1]);
			int max2 = Integer.parseInt(temp[2]) >= Integer.parseInt(temp[3]) ? Integer.parseInt(temp[2]) : Integer.parseInt(temp[3]);
			int result2 = max2 - min2;

			int min1 = Integer.parseInt(temp[0]) >= Integer.parseInt(temp[1]) ? Integer.parseInt(temp[0]) : Integer.parseInt(temp[1]);
			int max1 = Integer.parseInt(temp[2]) <= Integer.parseInt(temp[3]) ? Integer.parseInt(temp[2]) : Integer.parseInt(temp[3]);
			int result1 = max1 - min1;

			System.out.println(result1 + " " + result2);

		}
	}
}