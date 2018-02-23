package Random;

import java.util.Scanner;

/**
 * Created by shwetimahajan on 2/20/18.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int A[] = new int[num];
            for(int j = 0; j < num; j++) {
                A[j] = sc.nextInt();
                System.out.println(A[j]);
            }
        }
    }
}
