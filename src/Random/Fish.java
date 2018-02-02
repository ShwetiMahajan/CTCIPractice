package Random;

import java.util.Stack;
/**
 * Created by shwetimahajan on 12/21/17.
 */
public class Fish {
    public static class Each_Fish {
        int size = 0, direc = 0;
        Each_Fish(int A, int B){
            size = A;
            direc = B;
        }
    }
    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Each_Fish> st = new Stack<>();
        st.push(new Each_Fish(A[0],B[0]));
        for(int i = 1; i < A.length; i++) {
            System.out.println("Fish size: " + A[i]);
            if(B[i] == st.peek().direc) st.push(new Each_Fish(A[i], B[i]));
            else {
                if(st.peek().direc == 0) st.push(new Each_Fish(A[i], B[i]));
                else {
                    while(st.empty() == false && A[i] > st.peek().size && st.peek().direc == 1) st.pop();
                    if(st.empty()) st.push(new Each_Fish(A[i], B[i]));
                    else if(A[i] == st.peek().size) st.push(new Each_Fish(A[i], B[i]));
                    else if(st.peek().direc == B[i] || (st.peek().direc != B[i] && st.peek().direc == 0)) st.push(new Each_Fish(A[i], B[i]));
                }
            }
            System.out.println("Stack Size: " + st.size());
        }
        return st.size();
    }

    public static void main(String[] args) {
        int A[] = {4, 3, 2, 5, 1, 7};
        int B[] = {1, 1, 0, 0, 1, 0};
        System.out.println(solution(A, B));
    }
}
