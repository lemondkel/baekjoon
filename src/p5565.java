import java.util.Scanner;

public class p5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();

		for(int i=0; i<9; i++) {
			int temp = sc.nextInt();

			total -= temp;
		}

		System.out.println(total);
	}
}