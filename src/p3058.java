import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-11.
 */
public class p3058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int[] sum = new int[count];
		int[] min = new int[count];

		for (int i = 0; i < count; i++) {

			for (int j = 0; j < 7; j++) {
				int temp = sc.nextInt();

				if (min[i] == 0 && temp % 2 == 0)
					min[i] = temp;

				if (temp % 2 == 0) {
					sum[i] += temp;
					min[i] = min[i] < temp ? min[i] : temp;
				}
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.println(sum[i] + " " + min[i]);
		}
	}
}