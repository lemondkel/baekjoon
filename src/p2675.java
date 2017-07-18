import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2675 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int caseCount = sc.nextInt();
		sc.nextLine();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < caseCount; i++) {

			String temp = sc.nextLine();

			String[] result = temp.split(" ");
			int count = Integer.parseInt(result[0]);
			String str = result[1];

			StringBuilder stringBuilder = new StringBuilder();

			for (int x = 0; x < str.length(); x++) {
				for (int j = 0; j < count; j++) {
					stringBuilder.append(str.charAt(x));
				}
			}

			list.add(stringBuilder.toString());
		}

		for (String aList : list) System.out.println(aList);
	}
}