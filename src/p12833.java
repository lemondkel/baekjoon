import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-23 16:23:36
 */

public class p12833 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int temp = 0;

		temp = a ^ b;

		for (int i = 0; i < c; i++)
			temp = temp ^ b;

		temp = temp ^ b;

		System.out.println(temp);


	}
}