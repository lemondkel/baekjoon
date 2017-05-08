import java.util.Scanner;

/**
 * Created by user on 2017-05-08.
 */
public class p10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;

		for(int i=0; i<5; i++ ) {
			int x = sc.nextInt();

			if(x<40)
				x = 40;

			result += x;
		}

		System.out.println(result/5);
	}
}
