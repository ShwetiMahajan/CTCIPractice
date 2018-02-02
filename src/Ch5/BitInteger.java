package Ch5;

/**
 * Created by shwetimahajan on 12/5/17.
 */
public class BitInteger {
    public static int INTEGER_SIZE = 8;
    int bit_values[] = new int[INTEGER_SIZE];
    public BitInteger(){
    }
    public void set() {

    }
    public int fetch(int column) {
        return bit_values[column];
    }
}
