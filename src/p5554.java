import java.util.Scanner;

public class p5554 {
	/**
	 * l2jong insedu (2017-07-19)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int homeToSchool = sc.nextInt();
		int schoolToPCRoom = sc.nextInt();
		int pcRoomToInstitute = sc.nextInt();
		int instituteToHome = sc.nextInt();

		int result = homeToSchool + schoolToPCRoom + pcRoomToInstitute + instituteToHome;

		int minutes = result / 60;
		int seconds = result % 60;

		System.out.println(minutes);
		System.out.println(seconds);
	}
}