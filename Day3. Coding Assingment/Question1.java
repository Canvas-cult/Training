/****************************
  To chech validity of Sudoku 
 ****************************/

import java.util.*;
class Question1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char matrix[][]= new char [9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                matrix[i][j]=sc.next().charAt(0);
        }
        
        System.out.println(isValidSudoku(matrix));
    }

    private static boolean isValidSudoku(char[][] matrix) {
        int size=9;
        for(int i=0;i<size;i++){
            if(validRow(matrix, i))
                 return false;
            else 
             if(validColoum(matrix, i))
            
             return false;
             else 
               for(int j=0;j<size;j++)
               if(submatrix(matrix, i, j))
                return false;
         }
        return true;
    }

    public static boolean validRow(char arr[][],int row){
        int size=9;
        
        for(int col=0;col<size-1;col++){
            char ele=arr[row][col];
            for(int i=col+1;i<size;i++){
              if(ele!='.' && arr[row][i]== ele)
               {
                   System.out.println("Invalid row");
                   return true;
               }
               //System.out.println("NNNN");
            }
        }
        return false;
    }

    public static boolean validColoum(char arr[][], int col){
        int size=9;
        for(int row=0;row< size-1;row++){
               char ele =arr[row][col];
               for(int i=row+1;i<size;i++){
                if(ele!='.' && arr[i][col]== ele)
                 {
                     System.out.println("Invalid");
                     return true;
                 }
               }
        }
        return false;
    }

    public static boolean submatrix(char arr[][], int row, int col){
        int size=3;
        int boxRowStart = row - row % size;
        int boxColStart = col - col % size;
        int ele= arr[row][col];
        for (int sub_row = boxRowStart; sub_row < boxRowStart + size; sub_row++)
        {
            
            for (int sub_col = boxColStart; sub_col < boxColStart + size; sub_col++)
            {
                if (ele!='.' && (row!=sub_row && col!=sub_col) && arr[sub_row][sub_col] == ele)
                {
                    System.out.println("Invalid Submatrix");
                    return true;
                }
            }
        }
        return false;
    }
}
