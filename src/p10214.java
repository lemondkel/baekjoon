import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-23 23:25:38
 */

public class p10214 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int yonsei = 0;
		int korea = 0;

		int test_case = sc.nextInt();

		for (int i = 0; i < test_case; i++) {

			int yonsei_temp = 0, korea_temp = 0;

			for (int j = 0; j < 9; j++) {
				int yonsei_score = sc.nextInt();
				int korea_score = sc.nextInt();
				yonsei_temp += yonsei_score;
				korea_temp += korea_score;
			}

			if (yonsei_temp > korea_temp)
				System.out.println("Yonsei");
			else if (yonsei_temp == korea_temp)
				System.out.println("Draw");
			else
				System.out.println("Korea");

		}
	}
}