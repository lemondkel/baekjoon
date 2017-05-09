import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Test version
 * Created by user on 2017-05-09.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List listA = new ArrayList();
        List listB = new ArrayList();
        List listC = new ArrayList();
        String test;
        int case_a = 0;
        int case_b = 0;
        StringBuffer stringBuffer = new StringBuffer("");

        do {
            test = sc.nextLine();

            String[] str = new String[2];
            str = test.split(" ");

            case_a = Integer.parseInt(str[0]);
            case_b = Integer.parseInt(str[1]);
        } while (!(case_a <= 500000 && case_b <= 500000));

        for (int i = 0; i < case_a; i++) {
            String name;

            do {
                name = sc.nextLine();
            } while (!(name.length() <= 20));

            listA.add(name);
            stringBuffer.append(name +",");
        }

        for (int i = 0; i < case_b; i++) {
            String name;

            do {
                name = sc.nextLine();
            } while (!(name.length() <= 20));

            if (i != 0) {
                listB.add(name);
                String a = new String(stringBuffer);

                System.out.println(a);
                System.out.println(name);


                if(name.matches(a)) {
                    listC.add(name);
                }
            }
        }



        System.out.println(listC.size());
        for (int i = 0; i < listC.size(); i++) {
            System.out.println(listC.get(i));
        }
    }
}