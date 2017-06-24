import java.util.Scanner;

/*
 * Created by user on 2017-06-14.
 */
public class p9610 {
	private static int countQ1;
	private static int countQ2;
	private static int countQ3;
	private static int countQ4;
	private static int countAxis;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 0 || y == 0) {
				countAxis++;
			} else {
				if (x > 0) {
					if (y > 0) {
						countQ1++;
					} else
						countQ4++;
				} else {
					if (y > 0)
						countQ2++;
					else
						countQ3++;
				}
			}
		}

		System.out.println("Q1: " + countQ1);
		System.out.println("Q2: " + countQ2);
		System.out.println("Q3: " + countQ3);
		System.out.println("Q4: " + countQ4);
		System.out.println("AXIS: " + countAxis);
	}
}