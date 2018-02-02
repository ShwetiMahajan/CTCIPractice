package Random;

/**
 * Created by shwetimahajan on 1/29/18.
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

import static java.math.BigInteger.*;

public class CodilityTriangleTask {
    public static void main(String args[]) {
        int A[] = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int res = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }
        Collections.sort(a);
        for(int i = 0; i < a.size()-2; i++) {
            int sum = a.get(i) + a.get(i+1);
            if((a.get(i) == Integer.MAX_VALUE || a.get(i+1) == Integer.MAX_VALUE) && (a.get(i) > 0 && a.get(i+1) > 0)) {
                return 1;
            }
            if(a.get(i + 2) < sum) return 1;
        }
        return res;
    }
}
