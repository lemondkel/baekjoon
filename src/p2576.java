import java.util.Scanner;

public class p2576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = 0;
		int result = 0;
		boolean isFirst = true;

		for (int i = 0; i < 7; i++) {
			int temp = 0;

			do {
				temp = sc.nextInt();
			} while (!(temp <= 100));

			if (temp % 2 == 1 && isFirst) {
				min = temp;
				isFirst = false;
			}

			if (temp % 2 == 1) {
				result += temp;
				min = min > temp ? temp : min;
			}
		}

		if (!isFirst) {
			System.out.println(result);
			System.out.println(min);
		} else
			System.out.println(-1);

	}
}