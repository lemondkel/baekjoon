/**
 * Created by dkel on 2017-05-13.
 */
import java.util.Scanner;
public class pgh1 {
    public static void main(String arg[]){
        int a, b, c=0;
        Scanner in = new Scanner(System.in);

        //  쿼터25 다임10 니켈5 페니1

        a = in.nextInt();
        int[] Q = new int[a];
        int[] D = new int[a];
        int[] N = new int[a];
        int[] P = new int[a];


        int aa[] = new int[a];

        for(int i = 0; i<a; i++) {
            b = in.nextInt();

            for(int j = 0; j == 0;) { // Q
                b = b - 25;
                Q[i] += 1;
                if(b < 0) {
                    b = b+25;
                    Q[i] -= 1;
                    j++;
                } // if 종료
            } // 단위

            for(int j = 0; j == 0;) { // D
                b = b - 10;
                D[i] += 1;
                if(b < 0) {
                    b = b+10;
                    D[i] -= 1;
                    j++;
                } // if 종료
            } // 단위

            for(int j = 0; j == 0;) { // N
                b = b - 5;
                N[i] += 1;
                if(b < 0) {
                    b = b+5;
                    N[i] -= 1;
                    j++;
                } // if 종료
            } // 단위

            for(int j = 0; j == 0;) { // P
                b = b - 1;
                P[i] += 1;
                if(b < 0) {
                    b = b+1;
                    P[i] -= 1;
                    j++;
                } // if 종료
            } // 단위

        } // 전체 for 문


        for(int i = 0; i<aa.length;i++){
            for(int j = 0; j<1; j++){
                System.out.print(Q[i] + " ");
                System.out.print(D[i] + " ");
                System.out.print(N[i] + " ");
                System.out.print(P[i] + " ");
            }
            System.out.println();
        }
    }
}
