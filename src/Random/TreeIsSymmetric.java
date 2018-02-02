package Random;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by shwetimahajan on 1/24/18.
 */
public class TreeIsSymmetric {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String args[]) {
        System.out.println("Begin:");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
        System.out.println("Done");
    }
    public static boolean isSymmetric(TreeNode root) {
        return helperFunc(root, root);
    }

    public static boolean helperFunc(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        else if(l == null || r == null) return false;
        return (l.val == r.val) && helperFunc(l.left, r.right) && helperFunc(l.right, r.left);
    }
}
