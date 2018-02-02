package Random;

import java.util.Stack;
/**
 * Created by shwetimahajan on 1/17/18.
 */

//Not time-efficient : has O(n^2) complexity 
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "abcba";
        System.out.println("Result is : " + longestPalindrome(input));
    }
    public static String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        if(s == null) return s;
        int beg_index = 0;
        int max = 0;
        for(int i = 1; i < s.length(); i++) {
            System.out.println("i = "+i);
            for(int j = 0; j < s.length()-i; j++) {
                System.out.println("j = " + j);
                System.out.println("Looking at substring beginning at "+j+" and ending at "+ (j+i));


                if(isPalindrome(s, j, j+i)) {
                    System.out.println("The substring beginning at "+j+" and ending at "+ (j+i)+" is plaindrome!!!!!!!!!!!!!");
                    beg_index = j;
                    max = i;
                    break;
                }
            }
        }
        return s.substring(beg_index, beg_index+max+1);
    }

    public static boolean isPalindrome(String s, int start, int end) {
        System.out.println("*************************Inside Palindrome checking functn ************************");
        System.out.println("checking if substring from "+start+" to "+end );
        int length = end-start+1;
        System.out.println("The length :" + length);
        if(length == 2){
            if(s.charAt(start) == s.charAt(end)) return true;
            else return false;
        }
        boolean odd = false;
        if((end - start + 1)%2 != 0) odd = true;
        System.out.println("Odd : "+odd);
        Stack<Character> st = new Stack<>();
        int i = 0;
        for(i = start ; i < (start+length/2); ++i) {
            System.out.println("Pushing "+s.charAt(i)+" into stack");
            st.push(s.charAt(i));
        }
        if(odd) {
            i+=1;
            System.out.println("length is odd, so : i = "+i);
        }
        while(i <= end && !st.empty()) {
            if(st.peek() == s.charAt(i) && !st.isEmpty()) st.pop();
            else {
                System.out.println("Not palindrome");
                return false;
            }
            i++;
        }
        System.out.println("Is palindrome");
        return true;
    }
}
