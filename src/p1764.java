import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/**
 * Test version
 * Created by user on 2017-05-09.
 */
public class p1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case_a = sc.nextInt();
        int case_b = sc.nextInt();
        int sum = 0;

        sc.nextLine();

        String[] names = new String[case_a];
        List listA = new ArrayList();
        List listB = new ArrayList();
        List listC = new ArrayList();

        for (int i = 0; i < case_a; i++) {
            String name = sc.nextLine();

            listA.add(name);
        }

        for (int i = 0; i < case_b; i++) {
            String name = sc.nextLine();

            if(i!=0)
            listB.add(name);
        }

        for(int i=0; i<case_b; i++) {
            if(listB.get(i).equals(listA.get(i))) {
                listC.add(listA.get(i));
            }
        }

        System.out.println(listC.size());

        for(int i=0; i<listC.size(); i++) {
            System.out.println(listC.get(i));
        }
    }
}