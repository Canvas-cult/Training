

/******************************************************************
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
 ********************************************************************/
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size_row= sc.nextInt();
        int size_col= sc.nextInt();
        int arr[][]= new int[size_row][size_col];
        for(int row=0; row<size_row; row++){
            for(int col=0; col<size_col; col++)
             arr[row][col]= sc.nextInt();
        }
        int target=sc.nextInt();

        int valid_row=validRow(arr, size_row, size_col, target);
        //System.out.println(valid_row);
        System.out.println(binarySearch(arr, valid_row, size_col, target));
    }

    public static Boolean binarySearch(int arr[][], int row, int size_col, int target){ 
        int l = 0, r = size_col-1;
        if(row==-1)
         return false;
        while (l <= r) {
            int mid = l + r / 2;
            //System.out.println(mid);
            if (arr[row][mid] == target)
                return true;
            
               else if (arr[row][mid] < target)
                l = mid;
                else
                r = mid ;
        }
        return false;
    }

    public static int validRow(int arr[][], int size_row, int size_col, int target){
        for(int i=0; i<size_row; i++)
          { 
              
              if(arr[i][0]<= target && arr[i][size_col-1]>=target)
                {
                    //System.out.println(arr[i][0]+" "+arr[i][size_col-1]+"   "+target);
                    return i;
                }
          }
        return -1;
    }
}
