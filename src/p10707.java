import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-13 23:14:30
 */

public class p10707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x_pee;
		int y_pee;
		int y_maxCount;
		int y_perMeterPlusPee;
		int home_amount;

		do {
			x_pee = sc.nextInt();
		} while (!(x_pee >= 1 && x_pee <= 10000));

		do {
			y_pee = sc.nextInt();
		} while (!(y_pee >= 1 && y_pee <= 10000));

		do {
			y_maxCount = sc.nextInt();
		} while (!(y_maxCount >= 1 && y_maxCount <= 10000));

		do {
			y_perMeterPlusPee = sc.nextInt();
		} while (!(y_perMeterPlusPee >= 1 && y_perMeterPlusPee <= 10000));

		do {
			home_amount = sc.nextInt();
		} while (!(home_amount >= 1 && home_amount <= 10000));

		int x, y;

		x = home_amount * x_pee;

		if (home_amount <= y_maxCount) {
			y = y_pee;
		} else {
			y = y_pee + ((home_amount-y_maxCount) * y_perMeterPlusPee);
		}

		int result = x > y ? y : x;

		System.out.println(result);
	}
}