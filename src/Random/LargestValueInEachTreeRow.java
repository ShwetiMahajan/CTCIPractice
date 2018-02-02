package Random;

/**
 * Created by shwetimahajan on 1/27/18.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class LargestValueInEachTreeRow {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String args[]) {

    }
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<Integer> dist = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        res.add(root.val);
        queue.add(root);
        dist.add(0);
        while(!queue.isEmpty()) {
            TreeNode n = queue.removeFirst();
            int d = dist.removeFirst();
            if(res.size()>d) {
                if(n.val > res.get(d)) {
                    res.set(d, n.val);
                }
            }
            else res.add(n.val);
            queue.add(n.left);
            dist.add(d+1);
            queue.add(n.right);
            dist.add(d+1);
        }
        return res;
    }

    public static List<Integer> fastLargestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helperFunc(root, res, 0);
        return res;
    }
    public static void helperFunc(TreeNode root, List<Integer> res, int dist) {
        if(root == null) return;
        if(res.size() == dist) {
            res.add(root.val);
        }
        else {
            if(res.get(dist) < root.val) {
                res.set(dist,root.val);
            }
        }
        helperFunc(root.left, res, dist+1);
        helperFunc(root.right, res, dist+1);
    }
}
