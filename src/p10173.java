import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-13 14:38:48
 */

public class p10173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "";

		ArrayList strList = new ArrayList();

		int count = 0;

		do {

			str = sc.nextLine();
			count++;

			if (str.equals("EOI") || str.length() > 80)
				break;

			else {
				str = str.toLowerCase();
				strList.add(str);
			}

		} while (!(str.equals("EOI")) && str.length() <= 80);

		for (int i = 0; i < count - 1; i++) {
			if (strList.get(i).toString().contains("nemo"))
				System.out.println("Found");
			else
				System.out.println("Missing");
		}
	}
}