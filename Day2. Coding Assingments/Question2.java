/*
Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of all these triplets. 
The numbers in each triplet should be ordered in ascending order, and the triplets themselves should be ordered in ascending order with respect to the numbers they hold. 
If no three numbers sum up to the target sum, the function should return an empty array
*/
import java.util.*;
public class Question2
{
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int size=sc.nextInt();
	   int arr[]= new int[size];
	   for(int i=0;i<size;i++){
	       arr[i]= sc.nextInt();
	   }
	   int target = sc.nextInt();
	   sort(arr);
	   int sum=0,temp=0;
	   for(int i=0;i<size-2; i++){
	       for(int
	       j=i+1; j<size-1;j++){
	           sum=arr[i]+arr[j];
	           temp=target-sum;
	           if(search(arr,j+1,temp))
	            System.out.println("["+arr[i]+","+arr[j]+","+temp+"]");
	       }
	   }
	}
	public static boolean search(int arr[], int first, int target){
	    for(int i= first; i<arr.length;i++)
	    if(arr[i]==target) return true;
	    return false;
	}
	public static void sort(int arr[]){
		int size= arr.length;
		for(int i=0;i<size-1;i++){
			int min=i;
			for(int j=i; j<size; j++)
			   {
			   	if(arr[j]<arr[min])
			   	min=j;
			   }
			   
			   int temp=arr[min];
			   arr[min]=arr[i];
			   arr[i]=temp;
		}
	}
}
