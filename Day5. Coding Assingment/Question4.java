/****************************************************
 * Given an arr x n 2D binary grid grid which represents a arrap of '1's (land) and '0's (water), return the nuarrber of islands.

An island is surrounded by water and is forarred by connecting adjacent lands horizontally or vertically. 
You array assuarre all four edges of the grid are all surrounded by water.

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
        int count=0;
        for (int i = 0; i < size_row; i++)
        {
            for (int j = 0; j < size_col; j++)
            {
                if (arr[i][j] == 1)
                {
                    arr[i][j] = 0;
                    count++;
                    DFS(arr, i + 1, j, size_row, size_col);     //right side traversal
                    DFS(arr, i - 1, j, size_row, size_col);     //left side traversal
                    DFS(arr, i, j + 1, size_row, size_col);     //upward side traversal
                    DFS(arr, i, j - 1, size_row, size_col);     //downward side traversal
                    
                }
            }
        }
        System.out.println(count);
    }

    public static void DFS(int[][] arr, int i, int j, int ROW, int COL)
    {
        
        // Base condition
        // if i less than 0 or j less than 0 or i greater than ROW-1 or j greater than COL-  or if arr[i][j] != 1 then we will siarrply return
        if (i < 0 || j < 0 || i > (ROW - 1) || j > (COL - 1) || arr[i][j] != 1)
        {
            return;
        }
   
        if (arr[i][j] == 1)
        {
            arr[i][j] = 0;
            DFS(arr, i + 1, j, ROW, COL);     //right side traversal
            DFS(arr, i - 1, j, ROW, COL);     //left side traversal
            DFS(arr, i, j + 1, ROW, COL);     //upward side traversal
            DFS(arr, i, j - 1, ROW, COL);     //downward side traversal
            DFS(arr, i + 1, j + 1, ROW, COL); //upward-right side traversal
            DFS(arr, i - 1, j - 1, ROW, COL); //downward-left side traversal
            DFS(arr, i + 1, j - 1, ROW, COL); //downward-right side traversal
            DFS(arr, i - 1, j + 1, ROW, COL); //upward-left side traversal
        }
    }
}
