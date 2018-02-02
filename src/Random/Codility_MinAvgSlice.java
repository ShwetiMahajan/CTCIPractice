package Random;

import java.util.BitSet;

/**
 * Created by shwetimahajan on 1/27/18.
 */
public class Codility_MinAvgSlice {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        double min_avg = Double.MAX_VALUE;
        int start = 0;
        for(int i = 0; i < A.length -1;i++) {
            double sum = A[i] + A[i+1];
            if(sum/2 < min_avg) {
                min_avg = sum/2;
                start = i;
            }
        }
        for(int i = 0; i < A.length -2; i++) {
            double sum = A[i] + A[i+1] + A[i+2];
            if(sum/3 < min_avg) {
                min_avg = sum/3;
                start = i;
            }
        }
        return start;
    }
    public static void main(String args[]) {
        int i[] = {4,2,2,5,1,5,8};
        System.out.println(solution(i));
    }
}
