package Ch1;

import java.util.HashMap;
import java.util.Iterator;
/**
 * Created by shwetimahajan on 12/3/17.
 */
public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbbbbcccdddhjjjhh";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(hm.containsKey(c)) {
                int val = hm.get(c);
                hm.replace(c, val+1);
            }
            else {
                hm.put(c, 1);
            }
        }
        //appends the values for a char , no matter where it is located in the string, all together.
        StringBuilder sb = new StringBuilder();
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            sb.append(pair.getKey());
            sb.append(pair.getValue());
        }
        if(sb.length() == input.length()) System.out.println(input);
        else System.out.println(sb.toString());
    }
}
