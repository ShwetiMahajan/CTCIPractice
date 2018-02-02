package Ch2;

import Ch2.Partition.Node;
import java.util.Stack;
/**
 * Created by shwetimahajan on 12/8/17.
 */
//121121
public class Palindrome {
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
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(Node head) {
        boolean flag = true;
        Stack<Integer> s = new Stack<>();
        Node p1 = head;
        Node p2 = head;
        System.out.println("Pushing : " + p1.data);
        System.out.println("p2 at : "+p2.data);
        s.push(p1.data);
        int count = 1;
        while(p2.next != null) {
            if(p2.next.next != null) {
                p2 = p2.next.next;
                p1 = p1.next;
                count ++;
                s.push(p1.data);
                System.out.println("Pushing : " + p1.data);
                System.out.println("p2 at : "+p2.data);
            }
            else {
                p2 = p2.next;
                p1 = p1.next;
                s.push(p1.data);
                System.out.println("p2 at : " + p2.data);
            }
        }
        if(count%2!=0) s.pop();
        while (p1.next != null) {
            p1 = p1.next;
            if(p1.data == s.peek()) s.pop();
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
