package Random;

/**
 * Created by shwetimahajan on 12/5/17.
 */
public class Solution {
    public static void main(String[] args) {
        int P[] = {1,0,0,1,1,0};
        int k = 2;
        System.out.println(solution(P,k));
        System.out.println((k << 1)|0);
    }
    public static int solution(int P[], int k) {
        int start = -1;
        int sum = 0;
        for(int i = 0; i < P.length; i++) {
            if(P[i] == 1) {
                if(start < 0) {
                    start = i;
                    sum+=1;
                }
                else {
                    System.out.println("sum :" + sum);
                    sum+=1;
                }
                if(sum == k) {
                    start = i;
                    break;
                }
            }
            else {
                start = -1;
                sum = 0;
            }
        }
        return start;
    }
}
