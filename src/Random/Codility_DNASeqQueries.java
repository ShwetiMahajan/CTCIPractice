package Random;

/**
 * Created by shwetimahajan on 1/29/18.
 */
public class Codility_DNASeqQueries {
    public static void main(String args[]) {
        String s = "CAGCCTA";
        int P[] = {2,5,0};
        int Q[] = {4,5,6};
        int res[] = solution(s,P,Q);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    //Solution with O(N*M) time complexity where N is length of string and M length of query string
    public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int res[] = new int[P.length];
        for(int i = 0; i < P.length; i++) {
            String sub = S.substring(P[i], Q[i]+1);
                    res[i] = helpSol(sub);
        }
        return res;
    }

    public static int helpSol(String s) {
        if(s.contains("A")) return 1;
        else if(s.contains("C")) return 2;
        else if(s.contains("G")) return 3;
        return 4;
    }


    //Faster Solution O(m+n)
    public static int[] fastSolution(String S, int[] P, int[] Q) {
        int A[] = new int[S.length()];
        for(int i = 0; i < A.length; i++) {
            if(S.charAt(i) == 'A') A[i] = 1;
            else if(S.charAt(i) == 'C') A[i] = 2;
            else if (S.charAt(i) == 'G') A[i] = 3;
            else A[i] = 4;
        }
        int res[] = new int[P.length];
        for(int i = 0; i < P.length; i++) {

        }
        return res;
    }
}
