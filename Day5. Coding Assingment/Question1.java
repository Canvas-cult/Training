/*********************************************************
 *  Write a method void printArray(int[][]arr)
Prints array elements clock wise and anti-clockwise alternatively.
Input : 
 1 2 3
 4 5 6
 7 8 9
Output :
1 2 3 6 9 8 7 4 5
3 2 1 4 7 8 9 6 5
 ***********************************************************/

import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size_row= sc.nextInt();
        int size_col= sc.nextInt();
        int arr[][]= new int[size_row][size_col];
        for(int row= 0; row< size_row; row++){
            for(int col=0; col< size_col; col++)
             arr[row][col]= sc.nextInt();
        }
        printArray(arr, size_row, size_col);
        System.out.println();
        printArrayAntiClockwise(arr, size_row, size_col);
    }

    public static void printArray(int arr[][], int size_row, int size_col){

        int top=0, down=size_row-1, left=0, right= size_col-1, dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left; i<=right; i++)
                 System.out.print(arr[top][i]+" ");
                top++;
                dir++;
            }
             if(dir==1){
                 for(int i=top; i<= down; i++)
                 System.out.print(arr[i][right]+" ");
                --right;
                dir++;
             }
             if(dir==2){
                 for(int i=right; i>= left; i--)
                 System.out.print(arr[down][i]+" ");
                down--;
                dir++;
             } 
             if(dir==3){
                 for(int i=down; i>= top; i--)
                 System.out.print(arr[i][left]+" ");
                left++;
                dir=0;
             }

        }
    }

    public static void printArrayAntiClockwise(int arr[][], int size_row, int size_col){

        int top=0, down=size_row-1, left=0, right= size_col-1, dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=right; i>=left ; i--)
                 System.out.print(arr[top][i]+" ");
                top++;
                dir++;
            }
             if(dir==1){
                 for(int i=top; i<= down; i++)
                 System.out.print(arr[i][left]+" ");
                left++;
                dir++;
             }
             if(dir==2){
                 for(int i=left; i<= right; i++)
                 System.out.print(arr[down][i]+" ");
                down--;
                dir++;
             } 
             if(dir==3){
                 for(int i=down; i>= top; i--)
                 System.out.print(arr[i][right]+" ");
                right--;
                dir=0;
             }

        }
    }
}
