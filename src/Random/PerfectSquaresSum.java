package Random;

/**
 * Created by shwetimahajan on 1/27/18.
 */
public class PerfectSquaresSum {
    public static void main(String args[]) {
        int num = 2;
        System.out.println(numSquares(num));
    }

    public static int numSquares(int n) {
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Output for i : "+(i+1));
            if(isPerfectSquare(i+1)) {
                System.out.println("because it is perfect square ");
                a[i] = 1;
            }
            else {
                int j = i-1;
                int k = 0;
                a[i] = Integer.MAX_VALUE;
                while(j >= k) {
                    if(a[i] > (a[k]+a[j])) a[i] = a[k] + a[j];
                    j--; k++;
                }
            }
            System.out.println(" is : "+a[i]);
        }
        return a[n-1];
    }

    public static boolean isPerfectSquare(int n) {
        if (n == 0) return false;
        int sum = 0;
        int i = 1;
        while(sum < n) {
            sum += i;
            i += 2;
        }
        if(sum == n) return true;
        return false;
    }
}
