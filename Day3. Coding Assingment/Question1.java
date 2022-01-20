/****************************
  To chech validity of Sudoku 
 ****************************/

import java.util.*;
class Question1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=9;
        char matrix[][]= new char [size][size];

        // Taking input form user
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++)
                matrix[row][col]=sc.next().charAt(0);
        }
        
        System.out.println(isValidSudoku(matrix));
    }

    // fun to check validity of sudoku
    private static boolean isValidSudoku(char[][] matrix) {
        int size=9;
        for(int itrator=0;itrator<size;itrator++){
            if(validRow(matrix, itrator))
                 return false;
            else 
             if(validColoum(matrix, itrator))
            
             return false;
             else 
               for(int col_itrator=0;col_itrator<size;col_itrator++)
               if(submatrix(matrix, itrator, col_itrator))
                return false;
         }
        return true;
    }

    // function to check the validity of Row ---> if elements are already present it returns true
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

    // function to check the validity of coloum ---> if elements are already present it returns true
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

    // function to check the validity of sub matrix ---> if elements are already present in sub matrix it returns true
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
