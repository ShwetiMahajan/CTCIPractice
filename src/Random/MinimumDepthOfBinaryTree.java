package Random;

/**
 * Created by shwetimahajan on 1/24/18.
 */
public class MinimumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        int min_depth = 1;
        if(root.left == null && root.right == null ) return 0;
        else{
            if(root.right == null) {
                min_depth += minDepth(root.left);
            }
            else if(root.left == null) {
                min_depth += minDepth(root.right);
            }
            else {
                if(minDepth(root.left) <= minDepth(root.right)) {
                    min_depth += minDepth(root.left);
                }
                else min_depth += minDepth(root.right);
            }

        }
        return min_depth;
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.left.right.left = new TreeNode(6);
        System.out.println(minDepth(root));
    }
}
