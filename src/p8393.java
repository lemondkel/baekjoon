import java.util.Scanner;

/**
 * Created by user on 2017-05-08.
 */
public class p8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;

		int x = sc.nextInt();

		for(int i=1; i<=x; i++ ) {
			result += i;
		}

		System.out.println(result);
	}
}
