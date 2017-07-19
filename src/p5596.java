import java.util.Scanner;

public class p5596 {
	/**
	 * l2jong insedu (2017-07-19)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		String[] temp1 = str1.split(" ");
		String[] temp2 = str2.split(" ");

		int result1 = 0;
		int result2 = 0;

		for (String aTemp1 : temp1) {
			result1 += Integer.parseInt(aTemp1);
		}

		for (String aTemp2 : temp2) {
			result2 += Integer.parseInt(aTemp2);
		}

		if (result1 > result2)
			System.out.println(result1);
		else if (result1 < result2)
			System.out.println(result2);
		else
			System.out.println(result1);
	}
}