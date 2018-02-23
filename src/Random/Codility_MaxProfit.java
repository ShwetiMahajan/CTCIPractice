package Random;

/**
 * Created by shwetimahajan on 2/13/18.
 */

/*
Given an array of numbers, find 2 numbers with the maximum difference,
such that the larger value lies on the left side of the smaller one.
 */
public class Codility_MaxProfit {

    /*
    Solution 1 : Find the difference between adjacent elements and
    store them in an array. Now the problem that remains is to find
    the maximum sum of a slice.
     */
    public static int solution1(int A[]) {
        int res[] = new int[A.length - 1];
        for(int i = 1; i < A.length; i++) {
            res[i-1] = A[i] - A[i-1];
        }
        int sol1 = Codility_MaxSliceSum.sol(res);
        if(sol1 > 0) return sol1;
        else return 0;
    }

    /*
    Solution 2 : As you move forward in the array, find the difference of the
    ith elemnet with the min element seen in the array from index 0 to i-1.
    If i is the new min, update min_so_far.
     */
    public static int solution2(int A[]) {
        int max = Integer.MIN_VALUE;
        int min_so_far = A[0];
        for(int i = 1; i < A.length; i++) {
            if(A[i] - min_so_far > max) max = A[i] - min_so_far;
            if(A[i] < min_so_far) min_so_far = A[i];
        }
        if(max > 0) return max;
        else return 0;
    }

    public static void main(String[] args) {
        int A[] = {3,4,2,1,7,0};
        System.out.println(solution1(A));
        System.out.println(solution2(A));
    }
}
