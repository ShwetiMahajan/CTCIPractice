package Ch1;

import java.util.HashMap;
import java.util.Iterator;
/**
 * Created by shwetimahajan on 12/3/17.
 */
public class OneAway {
    public static void main(String[] args) {
        String st1 = "palee";
        String st2 = "pals";
        if(st1.length() >= st2.length()) System.out.println(isOneAway(st1, st2));
        else System.out.println(isOneAway(st2,st1));
    }
    public static boolean isOneAway(String s1, String s2) {
        if(s1.length() - s2.length() > 1) return false;
        int edit_count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(hm.containsKey(c)) {
                int val = hm.get(c);
                hm.replace(c, val+1);
            }
            else hm.put(c, 1);
        }
        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(!hm.containsKey(c)) edit_count++;
            else {
                int val = hm.get(c);
                hm.replace(c, val - 1);
            }
            if(edit_count > 1) return false;
        }
        Iterator it = hm.entrySet().iterator();
        int count= 0;
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if((Integer)pair.getValue() > 0) {
                count += (Integer)pair.getValue();
            }
            if(count > 1) return false;
        }
        if(s1.length() == s2.length() && count == 1) count = 0;
        edit_count+=count;
        if(edit_count > 1) return false;
        return true;
    }
}
