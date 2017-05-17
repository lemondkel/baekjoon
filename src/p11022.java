import java.util.Scanner;

public class p11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		sc.nextLine();

		int x = 1;

		while (x != i+1) {
			String str = sc.nextLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);

			System.out.println("Case #" + x + ": " + a + " + " + b + " = " + (a+b));

			x++;
		}
	}
}