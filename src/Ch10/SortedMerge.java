package Ch10;

/**
 * Created by shwetimahajan on 2/23/18.
 */
public class SortedMerge {

    //Time complexity : O(n+m)
    //Space : O(1)
    public static void main(String[] args) {
        int A [] = new int[20];
        int B [] = {2,4,8,18,23,34,40};
        A[1] = 17;
        A[2] = 20;
        A[0] = 1;
        A[5] = 45;
        A[3] = 32;
        A[4] = 39;
        sortedMerge(A,B,5);
    }

    public static void sortedMerge(int A[], int B[], int a_max) {
        int a_i = a_max;
        int b_i = B.length-1;
        int i = 0;
        for(i = (a_max+B.length) ; i >=0; i--) {
            if(A[a_i] >= B[b_i]){
                A[i] = A[a_i];
                a_i --;
            }
            else{
                A[i] = B[b_i];
                b_i --;
            }
            if(a_i < 0 || b_i < 0) break;
            System.out.println(A[i]);
        }
        while(a_i >= 0) {
            A[i] = A[a_i];
            i--;
            a_i--;
        }
        while(b_i >= 0) {
            A[i] = B[b_i];
            i--;
            b_i--;
        }
    }
}
