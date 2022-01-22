/****************************************************
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
 ********************************************************/
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size_row= sc.nextInt();
        int size_col= sc.nextInt();
        int arr[][]= new int[size_row][size_col];
        for(int row=0; row<size_row; row++){
            for(int col=0; col<size_col; col++)
             arr[row][col]= sc.nextInt();
        }
    }
}
