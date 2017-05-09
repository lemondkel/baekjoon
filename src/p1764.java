import java.util.*;

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
        List list = new LinkedList();
        Map mapA = new HashMap();

        for (int i = 0; i < case_a + case_b; i++) {
            String name = sc.nextLine();

            if (i < case_a) { // N범위동안
                mapA.put(name, i);
                names[i] = name;
            } else {
                if (i != case_a) { // N+1이 아닐 떄(N+2이상)
                    for (int j = 0; j < case_a; j++) {
                        if (name.equals(names[j])) {
                            list.add(names[j]);
                            sum++;
                            break;
                        }
                    }
                }
                if (i == case_a + case_b) {
                    System.out.println(sum);

                    for (int j = 0; j < sum; j++)
                        System.out.println(list.get(j));
                }
            }
        }
    }
}