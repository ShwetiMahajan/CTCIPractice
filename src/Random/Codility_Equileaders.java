package Random;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by shwetimahajan on 2/9/18.
 */

/*
Find the number of indexes S such that
the leaders(i.e.  value that occurs in more than half of the elements of the sequence)
of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
 */
public class Codility_Equileaders {
    public static void main(String args[]) {
        int a[] = {4,3,4,4,4,2}; // example array tested.
        int max_count = 0;
        int max = a[0];
        //find leader or the element occurring maximum times
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])) hm.put(a[i], 1);
            else {
                hm.replace(a[i],(hm.get(a[i])+1));
                if(hm.get(a[i])> max_count) {
                    max_count = hm.get(a[i]);
                    max = a[i];
                }
            }
        }
        //Search for indexes s
        int n = a.length;
        int count = 0;
        int res = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == max) count++;
            if(count > (i+1)/2) {
                if((max_count - count) > (n-i-1)/2) res++;
            }
        }
        System.out.println(res);
    }
}
