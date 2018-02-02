package Ch17;

import Ch5.BitInteger;

import java.util.ArrayList;

/**
 * Created by shwetimahajan on 12/5/17.
 */
public class MissingNumber {
    public static void main(String[] args) {
        ArrayList<BitInteger> array = new ArrayList<>();
        int v = findMissing(array, 0);
    }
    public static int findMissing(ArrayList<BitInteger> input, int column) {
        if(column > BitInteger.INTEGER_SIZE) return 0;
        ArrayList<BitInteger> even_ones = new ArrayList<>();
        ArrayList<BitInteger> odd_ones = new ArrayList<>();
        for(BitInteger i : input) {
            if(i.fetch(column) == 0) even_ones.add(i);
            else odd_ones.add(i);
        }
        if(odd_ones.size() <= even_ones.size()) {
            int v = findMissing(even_ones, column+1);
            return (v << 1) | 0;
        }
        else {
            int v = findMissing(odd_ones, column+1);
            return (v << 1) | 1;
        }
    }
}
