package Ch16;

/**
 * Created by shwetimahajan on 1/30/18.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class DivingBoard {
    public static void main(String args[]) {
        int k = 10;
        int shorter = 6;
        int longer = 12;
        List<Integer> lengths = solution(k, shorter, longer);
        for(int i = 0; i < lengths.size(); i++) {
            System.out.println(lengths.get(i));
        }
    }

    public static List<Integer> solution(int k, int shorter, int longer) {
        List<Integer> lengths = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i <= k; i++) {
            int length = shorter*i + (k-i)*longer;
            if(!lengths.contains(length)) {
                lengths.add(length);
                hs.add(length);
            }
        }
        return lengths;
    }
}
