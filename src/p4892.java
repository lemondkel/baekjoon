import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Test version
 * Created by user on 2017-05-13.
 */
public class p4892 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        List<String> list = new ArrayList<>();
        int count = 1;

        do {
            n = sc.nextInt();

            if (n == 0)
                break;

            int n1 = 3 * n;
            int n2;
            int n3;
            int n4;
            if (n1 % 2 == 0)
                n2 = n1 / 2;
            else
                n2 = (n1 + 1) / 2;

            n3 = 3 * n2;
            n4 = n3 / 9;

            String result = n1 % 2 == 0 ? ". even " : ". odd ";

            list.add(count + result + n4);
            count++;
        } while (true);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}