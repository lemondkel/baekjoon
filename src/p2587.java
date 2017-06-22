import java.util.Arrays;
import java.util.Scanner;

public class p2587 {
	/**
	 * l2jong insedu (2017-06-20)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] temp = new int[5];
		int average = 0;

		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextInt();
			average += temp[i];
		}

		average /= 5;
		Arrays.sort(temp);

		System.out.println(average);
		System.out.println(temp[2]);
	}
}