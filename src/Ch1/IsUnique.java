package Ch1;

import java.util.HashMap;
// Running time : O(n)
/**
 * Created by shwetimahajan on 12/1/17.
 */
public class IsUnique {
    public static void main(String[] args) {
        String str = "abcdk";
        System.out.println(isUnique(str));
    }

    public static boolean isUnique(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(hm.containsKey(c) == true) return false;
            hm.put(c, 1);
        }
        return true;
    }
}
