import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-11.
 */
public class p4504 {

	static final String NOT_MULTIPLE = " is NOT a multiple of ";
	static final String IS_MULTIPLE = " is a multiple of ";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		List<String> list = new ArrayList<String>();

		do {
			int test = sc.nextInt();
			if (test != 0) {
				if (test % n == 0)
					list.add(test + IS_MULTIPLE + n + ".");
				else
					list.add(test + NOT_MULTIPLE + n + ".");
			}

			temp = test;
		} while (temp != 0);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}