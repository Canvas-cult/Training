/* Write a program (without using inbuilt functions and not using Strings or array) to swap first and last digits of any number */

import java.util.*;
public class Question2 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int d=digit(n);
		int a=0;
		int num=n%d;
		a=(n%10)*d + (num-n%10) +n/d;
		System.out.println(a);
 
	}
	public static int digit(int n){
		int d=1;
		while(n!=0){
 
			n=n/10;
			d=d*10;
		}
		return d/10;
	}
}
