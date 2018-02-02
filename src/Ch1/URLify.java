package Ch1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by shwetimahajan on 12/3/17.
 */
public class URLify {
    public static void main(String[] args) {
        String input = "hello world com ";
        StringTokenizer str = new StringTokenizer(input, " ");
        StringBuilder result = new StringBuilder();
        while(str.hasMoreTokens()) {
            String temp = str.nextToken();
            if(str.hasMoreTokens()) {
                result.append(temp + "%20");
            }
            else {
                result.append(temp);
            }
        }
        System.out.println("The final URL is : " + result.toString());

        //another method with time O(n)

        int count = 0;
        char []char_input = input.toCharArray();
        for(int i = 0; i < char_input.length; i++) {
            if(char_input[i] == ' ') {
                count++;
            }
        }
        char []res = new char[char_input.length + 2*count];
        int j = 0;
        for(int i = 0; i < char_input.length; i++) {
            if(char_input[i] == ' ') {
                if ( i < char_input.length - 1 ) {
                    res[j] = '%';
                    res[j+1] = '2';
                    res[j+2] = '0';
                    j+=3;
                }
            }
            else {
                res[j] = char_input[i];
                j+=1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
