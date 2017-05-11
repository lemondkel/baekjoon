import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-11.
 */
public class p2506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		boolean cont = false;
		int plus = 1;
		int result = 0;

		for (int i = 0; i < count; i++) {
			int temp = sc.nextInt();

			if (temp == 1) {
				if (cont == false) {
					cont = true;
					result += plus;
				}
				else {
					plus++;
					result += plus;
				}
			} else {
				plus = 1;
				cont = false;
			}
		}
		System.out.println(result);
	}
}