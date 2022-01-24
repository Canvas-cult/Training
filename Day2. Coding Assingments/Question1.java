/************************************************************************
 * Write a program to remove duplicate values from an array and returns an array of unique values. int[] removeDuplicates(int[]values)
 ************************************************************************/
import java.util.*;
public class Question1
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++){
		    arr[i]= sc.nextInt();
		}
		int ans[]=new int[size];
		int ans_size=size;
		int j=0;
	    sort(arr);
	    ans[0]=arr[0];
	    for(int i=1;i<size;i++){
	        if(ans[j]!=arr[i])
	        {ans[++j]=arr[i];
	        //System.out.println(ans[j]);
	        }
	        else ans_size--;
	    }
	    disp(ans,ans_size);
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
	public static void disp(int arr[],int size){
	    //int size=arr.length;
	    for(int i=0;i<size;i++)
	    System.out.print(arr[i]+" ");
	}
}
