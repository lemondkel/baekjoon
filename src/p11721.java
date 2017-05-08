import java.util.Scanner;

/**
 * created by l2jong
 * 2017-03-15 14:32:28
 */

public class p11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();

		for(int i=1; i<=a.length(); i++) {
			System.out.print(a.charAt(i-1));
			if(i%10 == 0)
				System.out.println();
		}
	}
}