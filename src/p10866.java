import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p10866 {

	private static List<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new LinkedList<Integer>();

		int commandCount = sc.nextInt();
		sc.nextLine();

		String[] command = new String[commandCount];
		for (int i = 0; i < commandCount; i++) {
			command[i] = sc.nextLine();
			setCommand(command[i]);
		}
	}

	private static void setCommand(String command) {

		if (command.contains("push_front")) {
			String[] temp = command.split(" ");
			int x = Integer.parseInt(temp[1]);
			List<Integer> list2 = new LinkedList<Integer>();

			list2.add(x);
			list2.addAll(list);

			list = list2;

		} else if (command.contains("push_back")) {
			String[] temp = command.split(" ");
			int x = Integer.parseInt(temp[1]);
			list.add(x);

		} else if (command.equals("pop_front")) {
			if (list.size() > 0) {
				System.out.println(list.get(0));
				list.remove(0);
			} else
				System.out.println(-1);

		} else if (command.equals("pop_back")) {
			if (list.size() > 0) {
				System.out.println(list.get(list.size() - 1));
				list.remove(list.size() - 1);
			} else
				System.out.println(-1);

		} else if (command.equals("size")) {
			System.out.println(list.size());

		} else if (command.equals("empty")) {
			if (list.isEmpty())
				System.out.println(1);
			else
				System.out.println(0);

		} else if (command.equals("front")) {
			if (list.size() > 0)
				System.out.println(list.get(0));
			else
				System.out.println(-1);

		} else if (command.equals("back")) {
			if (list.size() > 0)
				System.out.println(list.get(list.size() - 1));
			else
				System.out.println(-1);

		}
	}
}