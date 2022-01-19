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
	   int sum=0,t=0;
	   for(int i=0;i<size-2; i++){
	       for(int
	       j=i+1; j<size-1;j++){
	           sum=arr[i]+arr[j];
	           t=target-sum;
	           if(search(arr,j+1,t))
	            System.out.println("["+arr[i]+","+arr[j]+","+t+"]");
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
