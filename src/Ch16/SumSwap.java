package Ch16;

/**
 * Created by shwetimahajan on 1/30/18.
 */
import java.util.HashSet;

public class SumSwap {
    public static void main(String args[]) {
        int l1[] = {4,1,2,1,1,2};
        int l2[] = {3,6,3,3};
        System.out.println(swapNums(l1,l2)[0] +" and "+ swapNums(l1,l2)[1]);
    }

    public static int[] swapNums(int l1[], int l2[]) {
        int sum1 = 0;
        int sum2 = 0;
        int res[] = new int[2];
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i = 0; i < l1.length; i++) {
            sum1+=l1[i];
            if(!hs1.contains(l1[i])) hs1.add(l1[i]);
        }
        for(int i = 0; i < l2.length; i++) {
            sum2+=l2[i];
        }
        int val = 0;
        if(sum1 >= sum2) {
            val = (sum1 - sum2)/2;
        }
        else val = (sum2 - sum1)/2;
        for(int i = 0; i < l2.length; i++) {
            res[0] = l2[i];
            if(sum1 >= sum2) {
                if(hs1.contains(res[0]+val)) {
                   res[1] = res[0]+val;
                   return res;
                }
            }
            else{
                if(hs1.contains(res[0]-val)) {
                    res[1] = res[0]-val;
                    return res;
                }
            }
        }
        return res;
    }
}
