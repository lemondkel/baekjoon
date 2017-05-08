import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-13 14:49:12
 */

public class p10174 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList list = new ArrayList();

		int count = sc.nextInt();
		sc.nextLine();

		for(int i=0; i<count; i++) {
			String str = sc.nextLine();

			str = str.toLowerCase();

			String str_temp = new StringBuffer(str).reverse().toString();

			if(str.equals(str_temp))
				list.add("Yes");
			else
				list.add("No");
		}

		for(int i=0; i<count; i++) {
			System.out.println(list.get(i).toString());
		}
	}
}