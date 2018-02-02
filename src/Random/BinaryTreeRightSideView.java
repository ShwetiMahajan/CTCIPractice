package Random;

/**
 * Created by shwetimahajan on 1/27/18.
 */
import java.util.List;
import java.util.ArrayList;
public class BinaryTreeRightSideView {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helperFunc(root, res, 0);
        return res;
    }

    public static void helperFunc(TreeNode root, List<Integer> res, int dist) {
        if(root == null) return;
        if(res.size() == dist) res.add(root.val);
        else res.set(dist, root.val);
        helperFunc(root.left, res, dist+1);
        helperFunc(root.right, res, dist+1);
    }
}
