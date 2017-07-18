import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3052 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		int printInteger = 0;

		for (int i = 0; i < 10; i++) {
			int temp = sc.nextInt();
			boolean isOverlapped = false;

			int result = temp % 42;

			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == result) {
					isOverlapped = true;
					break;
				}
			}

			if (isOverlapped) {
				printInteger++;
			} else {
				list.add(result);
			}
		}
		System.out.println(list.size());
	}
}