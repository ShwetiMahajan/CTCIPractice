package Ch2;

import Ch2.Partition.Node;
/**
 * Created by shwetimahajan on 12/8/17.
 */
public class SumList {
    public static void main(String[] args) {
        Node number11 = new Node(5);
        Node number12 = new Node(3);
        number11.next = number12;
        Node number13 = new Node(7);
        number12.next = number13;
        Node number21 = new Node(5);
        Node number22 = new Node(3);
        number21.next = number22;
        Node number23 = new Node(7);
        number22.next = number23;
        Node sum = getSum(number11, number21);
        while(sum!=null) {
            System.out.println(sum.data);
            sum = sum.next;
        }
    }
    public static Node getSum(Node n1, Node n2) {
        if(n1==null) return n2;
        if(n2==null) return n1;
        int sum = n1.data + n2.data;
        int carry = sum/10;
        n1 = n1.next;
        n2 = n2.next;
        Node sum_head = new Node(sum%10);
        Node n = sum_head;
        while(n1!=null || n2!=null) {
            if(n1!=null && n2!=null) {
                sum = n1.data + n2.data + carry;
                n1 = n1.next;
                n2 = n2.next;
            }
            else if(n1==null) {
                sum = n2.data + carry;
                n2 = n2.next;
            }
            else {
                sum = n1.data + carry;
                n1 = n1.next;
            }
            if(sum > 9) carry = 1;
            Node new_Node = new  Node(sum%10);
            n.next = new_Node;
            n = new_Node;
        }
        if(carry > 0) {
            Node new_Node = new  Node(carry);
            n.next = new_Node;
        }
        return sum_head;
    }
}
