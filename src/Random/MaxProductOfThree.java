package Random;

/**
 * Created by shwetimahajan on 1/29/18.
 */
import java.util.ArrayList;
import java.util.Collections;
public class MaxProductOfThree {
    public static void main(String args[]) {
        int A[] = {4,5,2,3,8,7,6,12,8,7,26,9,8,9,4,4,3,5,7};
        System.out.println(solution(A));
    }

    public static int solution(int A[]) {
        int prod = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            al.add(A[i]);
        }
        Collections.sort(al);
        for(int i = 0; i < al.size()-2; i++) {
            //System.out.println("Calculating new product");
            int temp = al.get(i)*al.get(i+1)*al.get(i+2);
            if(prod < temp) prod = temp;
        }
        return prod;
    }
}
