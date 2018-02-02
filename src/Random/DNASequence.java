package Random;

/**
 * Created by shwetimahajan on 12/18/17.
 */
public class DNASequence {
    // O(NM) Solution below
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int A[] = new int[S.length()];
        int res[] = new int[P.length];
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == 'A') A[i] = 1;
            else if(c == 'C') A[i] = 2;
            else if(c == 'G') A[i] = 3;
            else A[i] = 4;
        }
        for(int i = 0; i < P.length; i++) {
            res[i] = Integer.MAX_VALUE;
            for(int j = P[i]; j <= Q[i]; j++) {
                if(res[i] > A[j]) res[i] = A[j];
            }
        }
        double x = Math.exp(2);
        System.out.println();
        return res;
    }

}
