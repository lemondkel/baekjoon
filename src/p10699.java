import java.text.SimpleDateFormat;
import java.util.Date;

public class p10699 {
	/**
	 * l2jong insedu (2017-06-22)
	 */

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("YYYY-MM-dd");
		System.out.println(format.format(new Date()));
	}
}