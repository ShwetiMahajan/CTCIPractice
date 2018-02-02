package Ch1;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by shwetimahajan on 12/1/17.
 */
public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "abcc";
        String str2 = "acbb";
        System.out.println(checkPermutation(str1, str2));
    }

    public static boolean checkPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(hm.containsKey(c) == true) {
                int val = hm.get(c);
                hm.replace(c, val+1);
            }
            else {
                hm.put(c, 1);
            }
        }
        for(int i = 0; i < str1.length(); i++) {
            char c = str2.charAt(i);
            if(hm.containsKey(c) == true) {
                int val = hm.get(c);
                hm.replace(c, val+1);
            }
            else {
                return false;
            }
        }
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if((Integer)(pair.getValue())%2 != 0) return false;
        }
        return true;
    }
}
