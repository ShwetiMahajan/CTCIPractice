package Random;

import java.util.HashSet;

/**
 * Created by shwetimahajan on 12/8/17.
 */
public class SumOf3NoZero {
    public static void main(String[] args) {
        int input[] = {-1, 2, 0, 3, -4, 6, 1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < input.length; i++) {
            if(!hs.contains(input[i])) hs.add(input[i]);
        }
        boolean flag = false;
        int result[] = new int[3];
        for(int i = 0; i < input.length; i++) {
            int sum = 0;
            for(int j = 0; j < input.length; j++) {
                sum = input[i] + input[j];
                if(hs.contains(-sum)) {
                    result[0] = input[i];
                    result[1] = input[j];
                    result[2] = -sum;
                    flag = true;
                }
            }
        }
        if(flag) {
            //return result;
            System.out.println(result[0]);
            System.out.println(result[1]);
            System.out.println(result[2]);
        }
        else {
            //return null;
            System.out.println("No such numbers");
        }
    }
}
