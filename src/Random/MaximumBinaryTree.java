package Random;

/**
 * Created by shwetimahajan on 1/29/18.
 */
public class MaximumBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    public static void main(String args[]) {
        int A[] = {3,2,1,6,0,5};

    }

    public static TreeNode helperFunction(int A[], int start, int end) {
        int max = A[start];
        int index = start;
        for(int i = start+1; i <= end; i++) {
            if(A[i] > max) {
                max = A[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        if(index - start > 0) root.left = helperFunction(A, start, index-1);
        if(end - index > 0) root.right = helperFunction(A, index+1, end);
        return root;
    }
}
