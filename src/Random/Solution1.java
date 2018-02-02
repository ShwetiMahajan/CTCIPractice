package Random;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by shwetimahajan on 12/7/17.
 */
public class Solution1 {
    /*public static int solution(int[] T) {
        // write your code in Java SE 8
        HashSet<Integer> locations = new HashSet<>();
        int max_index = 0;
        int min_index = 0;
        for(int i = 0; i < T.length; i++) {
            if(!locations.contains(T[i])){
                locations.add(T[i]);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < T.length; i++) {
            if(!hs.contains(T[i])){
                hs.add(T[i]);
            }
            if(hs.size() == locations.size()){
                max_index = i;
            }
        }

        int trip_duration = max_index - min_index + 1;
        if(trip_duration == locations.size()) return trip_duration;

        for(int i = 0; i<T.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for(int j = i; j < T.length; j++) {
                if(!hs.contains(T[j])) hs.add(T[j]);
                if(hs.size() == locations.size() && trip_duration > (j-i+1)) {
                    trip_duration = j-i+1;
                }
            }
        }
        return trip_duration;
    }*/

    public static int sol(int T[]) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int first = 0;
        int last = 0;
        hs.put(T[first], first);
        for(int i = 1; i< T.length; i++) {
            if(!hs.containsKey(T[i])) {
                hs.put(T[i], i);
                last = i;
            }
            else
            {
                if(T[first] == T[i] && (i-first-1) < last-first) {
                    hs.replace(T[i], i);
                    last = i;
                    first = first + 1;
                }
            }
        }
        Iterator it = hs.entrySet().iterator();
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if(last < (Integer)pair.getValue()) last = (Integer)pair.getValue();
        }
        System.out.println(first);
        System.out.println(last);
        return last-first+1;
    }

    public static void main(String[] args) {
        int T[] = {4, 7, 3, 7, 1, 7, 3, 4, 1};
        System.out.println(sol(T));
    }
}
