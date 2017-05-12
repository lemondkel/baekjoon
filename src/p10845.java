import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-12.
 */
public class p10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue queue = new Queue();
		int commandCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < commandCount; i++) {
			String command = sc.nextLine();
			queue.command(command);
		}

	}

	static class Queue {
		List list;
		private final static int EMPTY_SIZE = -1;

		Queue() {
			list = new LinkedList();
		}

		void command(String text) {
			String[] temp = text.split(" ");

			if (temp[0].equals("push")) {
				int result = Integer.parseInt(temp[1]);
				list.add(result);

			} else if (text.equals("pop")) {
				if (list.size() != 0) {
					System.out.println(list.get(0));
					list.remove(0);

				} else {
					System.out.println(EMPTY_SIZE);
				}

			} else if (text.equals("size")) {
				System.out.println(list.size());

			} else if (text.equals("empty")) {
				int result = list.isEmpty() ? 1 : 0;

				System.out.println(result);

			} else if (text.equals("front")) {
				if (list.size() != 0)
					System.out.println(list.get(0));
				else
					System.out.println(EMPTY_SIZE);

			} else if (text.equals("back")) {
				if (list.size() != 0)
					System.out.println(list.get(list.size() - 1));
				else
					System.out.println(EMPTY_SIZE);
			}
		}
	}
}

