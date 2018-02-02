package Random;

/**
 * Created by shwetimahajan on 12/20/17.
 */
public class MinAvgSlice {
    public static void main(String[] args) {
        int A[] = {4,2,2,5,1,5,8};
        System.out.println(solution(A));
    }
    public static int solution(int A[]) {
        double min_avg = Double.MAX_VALUE;
        int i = 0;
        int pos = 0;
        while(i < (A.length-1)) {
            double sum = A[i] + A[i+1];
            if(sum/2 < min_avg) {
                min_avg = sum/2;
                pos = i;
            }
            if((i+2)< A.length) {
                sum += A[i+2];
                if(sum/3 < min_avg) {
                    min_avg = sum/3;
                    pos=i;
                    int j = i;
                }
            }
            i++;
        }
        return pos;
    }
}
