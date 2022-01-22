/******************************************************
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.
 ******************************************************/

 import java.util.*;
 public class Question3
 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int nums= sc.nextInt();
         int arr[]= new int[nums];
         for(int itrator=0 ;itrator< nums; itrator++)
           arr[itrator]= sc.nextInt();
         
         int k=sc.nextInt();
         int ans[]= new int[nums-k+1];
         int max=arr[0];
         for(int arr_itrator=0; arr_itrator<nums-k+1 ;arr_itrator++)
            {
                max= arr[arr_itrator];
                for(int window_itrator= arr_itrator ; window_itrator < arr_itrator+k ; window_itrator++){
                    if(max< arr[window_itrator])
                    max=arr[window_itrator];
                    //System.out.print(max+" ");
                }
                System.out.println(max);
            }

     }
 }