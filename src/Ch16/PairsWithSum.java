package Ch16;

/**
 * Created by shwetimahajan on 1/30/18.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class PairsWithSum {
    public static void main(String args[]) {
        int A [] = {5,7,3,1,6,5,9};
        int targetSum = 10;
        List<ArrayList<Integer>> res = solution(A, targetSum);
        for(int i = 0; i < res.size(); i++) {
            System.out.println(" Pair : "+res.get(i).get(0)+ " and "+res.get(i).get(1));
        }
    }

    public static List<ArrayList<Integer>> solution(int A[], int sum) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        HashSet<ArrayList<Integer>> res = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if(!hs.contains(A[i])) hs.add(A[i]);
        }
        for(int i = 0; i < A.length; i++) {
            if(hs.contains(sum-A[i])) {
                ArrayList<Integer> l = new ArrayList<>();
                if(A[i] <= (sum-A[i])) {
                    l.add(A[i]);
                    l.add(sum - A[i]);
                }
                else {
                    l.add(sum-A[i]);
                    l.add(A[i]);  
                }
                if(!res.contains(l)) {
                     pairs.add(l);
                     res.add(l);
                }

            }
        }
        return pairs;
    }
}
