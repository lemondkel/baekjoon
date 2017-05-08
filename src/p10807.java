import java.util.Scanner;

/**
 * created by l2jong
 * 2017-04-28 11:28:24
 */

public class p10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int value = 0;

		int temp[] = new int[count];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextInt();
		}

		int x = sc.nextInt();

		for (int i = 0; i < temp.length; i++) {
			if (x == temp[i])
				value++;
		}

		System.out.println(value);
	}
}