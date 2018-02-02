package Ch16;

import java.util.HashMap;
/**
 * Created by shwetimahajan on 12/9/17.
 */
/*
Built using a doubly linked list(similar to a queue but deletes from the end)
and a HashMap with key as the key and value as the Node whose data is the
mapped data value for that key.
 */
public class LRUCache {
    public class Node{
        String value;
        Node prev = null;
        Node next = null;
        public Node(String value) {
            this.value = value;
        }
    }
    int max_size;
    static int count = 0;
    Node first = null;
    Node last = null;
    HashMap<Integer, Node> hm;
    public LRUCache(int max_size) {
        this.max_size = max_size;
        hm = new HashMap<>();
    }

    public void add(int key, String value) {
        Node n = new Node(value);
        if(first == null) {
            first = n;
            count++;
            last = n;
        }
        else{
            if(count == max_size) {
                evictLeastRecentlyUsed();
            }
            n.next = first;
            first.prev = n;
            first = n;
            count++;
        }
        if(!hm.containsKey(key)) {
            hm.put(key, n);
        }
        else hm.replace(key, n);
    }

    public void evictLeastRecentlyUsed() {
        last = last.prev;
        last.next = null;
        count--;
    }

    public String retrieve(int key) {
        if(hm.containsKey(key)) {
            //update first
            Node n = hm.get(key);
            n.prev.next = n.next;
            n.next.prev = n.prev;
            n.next = first;
            first.prev = n;
            n.prev = null;
            first = n;
            return hm.get(key).value;
        }
        else return null;
    }
}
