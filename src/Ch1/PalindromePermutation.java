package Ch1;


import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by shwetimahajan on 12/3/17.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        String input = "tacocat"; // the input must not have any spaces and should be in lower case
        System.out.println(checkPalindrome(input));
    }
    public static boolean checkPalindrome(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            if(hm.containsKey(input.charAt(i)) == false) hm.put(input.charAt(i), 1);
            else {
                int val = hm.get(input.charAt(i));
                hm.replace(input.charAt(i), val + 1);
            }
        }
        Iterator it = hm.entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if((Integer)pair.getValue() % 2 != 0) {
                if(input.length()%2 == 0) return false;
                count+=1;
                if(count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
