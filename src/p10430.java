import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-23 15:58:31
 */

public class p10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		System.out.println((x + y) % z);
		System.out.println((x % z + y % z) % z);
		System.out.println((x * y) % z);
		System.out.println((x % z * y % z) % z);
	}
}