import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-14 00:15:18
 */

public class p8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		int result = 0;

		for (int i = 0; i < count; i++) {
			result++;
		}

		//System.out.println(count);

		for (int i = 2; i <= count; i++) {

			if ((Math.sqrt(i) - (int) Math.sqrt(i)) == 0) {
				//System.out.println(i);

				for (int j = 1; j <= i; j++) {
					if (j * j == i) {
						//System.out.println(j + "가 전의 수 ");

						for (int k = i; k <= count; k = k + j) {
							result++;
							//System.out.println(k + " : " + result);
						}
					}
				}

			}

		}

		System.out.println(result);
	}
}