import java.util.Scanner;

public class p10769 {
	/**
	 * l2jong insedu (2017-07-18)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int happy = 0;
		int sad = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ':') {
				try {
					if (str.charAt(i + 1) == '-') {
						if (str.charAt(i + 2) == ')') {
							happy++;
						} else if (str.charAt(i + 2) == '(') {
							sad++;
						}
					}
				} catch (Exception ignored) {
				}
			}
		}

		String result;
		if (happy > sad)
			result = "happy";
		else if (happy == sad && happy != 0)
			result = "unsure";
		else if (happy < sad)
			result = "sad";
		else
			result = "none";

		System.out.println(result);
	}
}