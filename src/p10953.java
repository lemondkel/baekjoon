import java.util.Scanner;

public class p10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		sc.nextLine();

		while (i != 0) {
			String str = sc.nextLine();
			int a = Integer.parseInt(str.split(",")[0]);
			int b = Integer.parseInt(str.split(",")[1]);

			System.out.println(a + b);

			i--;
		}
	}
}