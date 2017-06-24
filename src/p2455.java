import java.util.Scanner;

public class p2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int current = 0;
		int max = 0;

		for(int i=0; i<4; i++) {
			String str = sc.nextLine();
			int out = Integer.parseInt(str.split(" ")[0]);
			int in = Integer.parseInt(str.split(" ")[1]);

			current -= out;
			current += in;

			max = current > max ? current : max;
		}

		System.out.println(max);
	}
}