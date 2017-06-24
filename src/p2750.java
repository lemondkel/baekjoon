import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p2750 {

	private static List<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for(int i=0; i<count; i++) {
			int x = sc.nextInt();
			list.add(x);
		}

		Collections.sort(list);

		for(int i=0; i<count; i++)
			System.out.println(list.get(i));
	}
}