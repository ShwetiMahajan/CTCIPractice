package Random;

import java.util.*;

/**
 * Created by shwetimahajan on 1/24/18.
 */
public class BinaryTreeLevelOrderTraversal2 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.left.right.left = new TreeNode(6);
        List<List<Integer>> ls = levelOrderBottom(root);
        for(int i = 0; i < ls.size(); i++) {
            System.out.println("++++++++++++++++level = "+i + "  +++++++++++++++++++");
            for(int j = 0; j < ls.get(i).size(); j++) {
                System.out.println(ls.get(i).get(j));
            }
        }
    }
    public static class Node {
        TreeNode node;
        int level;
        Node(TreeNode n, int l) {node = n; level = l;}
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(new Node(root, 0));
        while(!queue.isEmpty()) {
            Node n = queue.removeFirst();
            if(ls.size() > n.level) {
                ls.get(n.level).add(n.node.val);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(n.node.val);
                ls.add(al);
            }
            if(n.node.left != null) queue.add(new Node(n.node.left, n.level+1));
            if(n.node.right != null) queue.add(new Node(n.node.right, n.level+1));
        }
        Collections.reverse(ls);
        return ls;
    }
}
