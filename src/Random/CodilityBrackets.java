package Random;

/**
 * Created by shwetimahajan on 1/29/18.
 */
import java.util.Stack;
public class CodilityBrackets {
    public static void main(String args[]) {
        String s = "";
        System.out.println(solution(s));
        s = new String("({})[]");
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        if(s.length() == 0 || s == null) return 1;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else{
                if(st.isEmpty()) {
                    return 0;
                }
                else if((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{') || (c == ']' && st.peek() == '[')) {
                    st.pop();
                }
                else return 0;
            }
            i++;
        }
        if(st.isEmpty() && i == s.length()) return 1;
        return 0;
    }
}
