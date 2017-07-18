import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p9086 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int caseCount = sc.nextInt();
		sc.nextLine();

		List<String> list = new ArrayList<>();

		for (int i = 0; i < caseCount; i++) {
			String str = sc.nextLine();
			StringBuilder stringBuilder = new StringBuilder();

			stringBuilder.append(Character.toString(str.charAt(0)));
			stringBuilder.append(Character.toString(str.charAt(str.length() - 1)));

			list.add(stringBuilder.toString());
		}

		for (int j = 0; j < list.size(); j++)
			System.out.println(list.get(j));
	}
}