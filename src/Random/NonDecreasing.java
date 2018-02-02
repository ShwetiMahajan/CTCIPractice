package Random;

/**
 * Created by shwetimahajan on 12/23/17.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

class NonDecreasing {

    /**
     * Take a rectangular grid of numbers and find the length
     * of the longest sub-sequence.
     * @return the length as an integer.
     */
    public static int longestSequence(int[][] grid) {
        // TODO: implement this function
        int m = grid.length;
        int n = grid[0].length;
        int[][] T = new int[m][n];
        int i = 0, j = 0;
        T[i][j] = 0;
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                //Move up
                if(i > 0 && Math.abs(grid[i-1][j] - grid[i][j])>3){
                    T[i][j] = Math.max(T[i][j], T[i-1][j]+1);
                    System.out.println("up"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move down
                if(i < m-1 && Math.abs(grid[i+1][j] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i+1][j]+1);
                    System.out.println("down"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move right
                if(j < n-1 && Math.abs(grid[i][j+1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i][j+1]+1);
                    System.out.println("right"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move left
                if(j > 0 && Math.abs(grid[i][j-1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i][j-1]+1);
                    System.out.println("left"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move diagonally up right
                if(i > 0 && j < n-1 && Math.abs(grid[i-1][j+1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i-1][j+1]+1);
                    System.out.println("diagonally up right"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move diagonally up left
                if(i > 0 && j > 0 && Math.abs(grid[i-1][j-1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i-1][j-1]+1);
                    System.out.println("diagonally up left"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move diagonally down right
                if(i < m-1 && j < n-1 && Math.abs(grid[i+1][j+1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i+1][j+1]+1);
                    System.out.println("diagonally down right"+T[i][j]+" grid : "+grid[i][j]);
                }
                //Move diagonally down left
                if(i < m-1 && j > 0 && Math.abs(grid[i+1][j-1] - grid[i][j])>3) {
                    T[i][j] = Math.max(T[i][j], T[i+1][j-1]+1);
                    System.out.println("diagonally down left"+T[i][j]+" grid : "+grid[i][j]);
                }
            }
        }
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        int grid[][] = {{9,7,3},{1,6,0},{4,2,8}};
        int length = longestSequence(grid);
        System.out.println(length);
    }
}







