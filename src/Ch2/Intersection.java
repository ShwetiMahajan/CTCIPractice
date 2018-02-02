package Ch2;

import Ch2.Partition.Node;

import java.util.HashSet;

/**
 * Created by shwetimahajan on 12/8/17.
 */
public class Intersection {
    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node n11 = new Node(2);
        h1.next = n11;
        Node n12 = new Node(3);
        n11.next = n12;
        Node h2 = new Node(1);
        Node n21 = new Node(2);
        h2.next = n21;
        Node n22 = new Node(4);
        n21.next = n22;
        Node intersection = areIntersecting(h1, h2);
        if(intersection!=null) System.out.println("true");
        else System.out.println("false");
    }
    public static Node areIntersecting(Node h1, Node h2) {
        boolean flag = false;
        Node n = h1;
        HashSet<Node> hs = new HashSet<>();
        while(n!=null) {
            hs.add(n);
            n = n.next;
        }
        n = h2;
        while(n!=null) {
            if(hs.contains(n)) {
                flag = true;
                break;
            }
            n = n.next;
        }
        if(flag) return n;
        return null;
    }
}
