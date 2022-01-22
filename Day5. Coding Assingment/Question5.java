/****************************************************
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.
 ****************************************************/

import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[][]= new int[size][size];
        for(int row=0; row<size; row++){
            for(int col=0; col<size; col++)
                arr[row][col]= sc.nextInt();
        }

        // transpose
         for(int row=0; row<size; row++){
            for(int col=row+1; col<size; col++){
                int temp= arr[row][col];
                
                //System.out.println(temp+" "+arr[row][col]+" "+ arr[col][row]);
                arr[row][col]= arr[col][row];
                arr[col][row]= temp;
                //System.out.println(arr[row][col]+" "+ arr[col][row]);
            }
        }

        // mirror image
         for(int row=0; row<size; row++){
             for(int col=0; col<size/2; col++){ 
                int temp =arr[row][col];
                arr[row][col]= arr[row][size-col-1];
                arr[row][size-col-1]= temp;
             }
         }

         // display
        for(int row=0; row<size; row++){
            for(int col=0; col<size; col++)
                System.out.print(arr[row][col]+" ");
            System.out.println();
        }
    }
}
