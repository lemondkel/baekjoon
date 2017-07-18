import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1453 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count;
		do {
			count = sc.nextInt();
		} while (!(count <= 100));
		int cancel = 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			boolean isFirst = true;
			int temp = sc.nextInt();

			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == temp) {
					isFirst = false;
				}
			}

			if (isFirst) {
				list.add(temp);
			} else {
				cancel++;
			}
		}

		System.out.println(cancel);
	}
}