package Random;

/**
 * Created by shwetimahajan on 2/13/18.
 */
public class Codility_MaxSliceSum {
    public static void main(String[] args) {
        int A[] = {3,-1,2};
        System.out.println(sol(A));
        int B[] = {-2,1};
        System.out.println(sol(B));
        int C[] = {-10};
        System.out.println(sol(C));
        int D[] = {-3,-5,-4,-1};
        System.out.println(sol(D));
        int E[] = {-3,-5,-4,-1,0};
        System.out.println(sol(E));
        int F[] = {3,5,4,1};
        System.out.println(sol(F));

    }
    public static int sol(int A[]) {
        int me = A[0];
        int ms = A[0];
        for(int i = 1; i < A.length; i++) {
            int s = me + A[i];
            if(s >= 0) {
                me = s;
                if(ms < me) ms = me;
            }
            else {
                me = 0;
            }
            if(ms < A[i]) {
                ms = A[i];
                me = ms;
            }
        }
        return ms;
    }
}
