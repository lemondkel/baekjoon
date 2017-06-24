import java.util.List;
import java.util.Scanner;

public class p2577 {

	private static List<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int temp = A*B*C;

		String str = Integer.toString(temp);

		int[] result = new int[10];
		char[] ch = str.toCharArray();

		for(int i=0; i<ch.length; i++) {
			switch (ch[i]) {
				case '0':
					result[0]++;
					break;
				case '1':
					result[1]++;
					break;
				case '2':
					result[2]++;
					break;
				case '3':
					result[3]++;
					break;
				case '4':
					result[4]++;
					break;
				case '5':
					result[5]++;
					break;
				case '6':
					result[6]++;
					break;
				case '7':
					result[7]++;
					break;
				case '8':
					result[8]++;
					break;
				case '9':
					result[9]++;
					break;
			}
		}

		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);

	}
}