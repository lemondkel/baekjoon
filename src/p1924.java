import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-15 13:27:03
 */

public class p1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] daysPerMon = {31,28,31,30,31,30,31,31,30,31,30,30,31};
		String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

		int sum = 0;

		for(int i=0; i<(x-1); i++) {

			sum += daysPerMon[i];
		}

		sum += y;

		switch(sum%7) {
			case 1:
				System.out.println(day[0]);
				break;
			case 2:
				System.out.println(day[1]);
				break;
			case 3:
				System.out.println(day[2]);
				break;
			case 4:
				System.out.println(day[3]);
				break;
			case 5:
				System.out.println(day[4]);
				break;
			case 6:
				System.out.println(day[5]);
				break;
			case 0:
				System.out.println(day[6]);
				break;

		}
	}
}