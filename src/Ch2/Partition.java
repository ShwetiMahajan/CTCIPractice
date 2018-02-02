package Ch2;

/**
 * Created by shwetimahajan on 12/8/17.
 */
public class Partition {
    public static class Node{
        int data;
        Node next = null;
        public Node(int d) {
            data = d;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        Node node1 = new Node(5);
        head.next = node1;
        Node node2 = new Node(8);
        node1.next = node2;
        Node node3 = new Node(2);
        node2.next = node3;
        Node node4 = new Node(10);
        node3.next = node4;
        Node node5 = new Node(1);
        node4.next = node5;
        Node n = partition(head, 5);
        while(n!=null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
    public static Node partition(Node head, int key) {
        Node large = head;
        Node n = head;
        boolean flag = false;
        while(n != null) {
            if(n.data >= key) {
                if(!flag){
                    large = n;
                    flag = true;
                }
            }
            else{
                if(flag) {
                    int temp = large.data;
                    large.data = n.data;
                    n.data = temp;
                    large = large.next;
                }
            }
            n = n.next;
        }
        return head;
    }
}
