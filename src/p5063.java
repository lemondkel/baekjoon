import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-13 17:02:38
 */

public class p5063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList list = new ArrayList();

		int case_count = sc.nextInt();

		for(int i=0; i<case_count; i++) {

			int no_ad = sc.nextInt();
			int yes_ad = sc.nextInt();
			int ad_fee = sc.nextInt();

			if(yes_ad-ad_fee > no_ad) {
				list.add("advertise");
			}
			else if (yes_ad-ad_fee == no_ad) {
				list.add("does not matter");
			}
			else {
				list.add("do not advertise");
			}
		}

		for(int i=0;i<case_count; i++) {
			System.out.println(list.get(i).toString());
		}
	}
}