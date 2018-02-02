package Random;

/**
 * Created by shwetimahajan on 1/27/18.
 */
import java.util.BitSet;
public class BitSetDemo {
    public static void main(String args[]) {
        BitSet b = new BitSet(5);
        for(int i = 0; i < 5; i++) {
            b.set(i);
            System.out.println(b.get(i));
        }
        b.set(2);
        int A[] = new int[100];
        for(int i = 0 ; i < A.length; i++) {

        }
        System.out.println(solution(A));
    }

    public static int solution(int A[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) max = A[i];
        }
        //System.out.println("max : "+max);
        if(max <= 0) return 1;
        BitSet a = new BitSet(max);
        for(int i = 0; i < A.length; i++) {
            //System.out.println("Setting the index :" + (A[i]-1));
            a.set(A[i]-1);
            //System.out.println("The index A[i]-1 is now : "+a.get(A[i]-1));
        }
        for(int i = 0; i < max; i++) {
            System.out.println("index : "+i);
            if(!a.get(i)) return i+1;

        }
        return max+1;
    }
}
