package Ch2;

import Ch2.Partition.Node;

import java.util.HashSet;

/**
 * Created by shwetimahajan on 12/9/17.
 */
public class LoopDetection {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        head.next = n1;
        Node n2 = new Node(1);
        n1.next = n2;
        Node n3 = new Node(1);
        n2.next = n3;
        Node n4 = new Node(2);
        n3.next = n4;
        Node n5 = new Node(1);
        n4.next = n5;
        n5.next = n2;
        if(startNodeOfLoop(head) != null) System.out.println("true");
        else System.out.println("false");
    }
    public static Node startNodeOfLoop(Node head) {
        Node n = head;
        boolean loopDetected = false;
        HashSet<Integer> hs = new HashSet<>();
        while(n!=null) {
            if(hs.contains(n.hashCode())) {
                loopDetected = true;
                break;
            }
            else {
                hs.add(n.hashCode());
            }
            n = n.next;
        }
        if(loopDetected) return n;
        else return null;
    }
}
