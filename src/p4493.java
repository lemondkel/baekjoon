import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-12.
 */
public class p4493 {

	final static String WIN = "Player 1";
	final static String DRAW = "TIE";
	final static String LOSE = "Player 2";


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			Person[] people = new Person[2];
			int caseCount = sc.nextInt();
			sc.nextLine();

			for (int z = 0; z < people.length; z++) {
				people[z] = new Person();
			}

			for (int j = 0; j < caseCount; j++) {
				String text = sc.nextLine();
				String[] result = text.split(" ");

				if (result[0].equals("R")) {
					if (result[1].equals("S")) {
						people[0].count++;
					}
				} else if (result[0].equals("S")) {
					if (result[1].equals("P")) {
						people[0].count++;
					}
				} else if (result[0].equals("P")) {
					if (result[1].equals("R")) {
						people[0].count++;
					}
				}

				if (result[1].equals("R")) {
					if (result[0].equals("S")) {
						people[1].count++;
					}
				} else if (result[1].equals("S")) {
					if (result[0].equals("P")) {
						people[1].count++;
					}
				} else if (result[1].equals("P")) {
					if (result[0].equals("R")) {
						people[1].count++;
					}
				}
			}

			if (people[0].count > people[1].count)
				list.add(WIN);
			else if (people[0].count == people[1].count)
				list.add(DRAW);
			else
				list.add(LOSE);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}

	}

	static class Person {
		int count;
	}
}