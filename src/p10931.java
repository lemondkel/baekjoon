import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-11.
 */
public class p10931 {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		try {
			byte[] buffer = text.getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance("sha-384");
			messageDigest.update(buffer);

			byte[] digest = messageDigest.digest();
			String hex = "";

			for (int i = 0; i < digest.length; i++) {
				int b = digest[i] & 0xff;
				if (Integer.toHexString(b).length() == 1) {
					hex = hex + "0";
				}
				hex = hex + Integer.toHexString(b);
			}

			System.out.println(hex);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}