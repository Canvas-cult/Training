/* Find the largest number less than N whose each digit is prime number */

import java.util.*;
public class Question3 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int digit=1,s=0,r=0;
		while(n!=0){
			r=n%10;
			if(r<=1){
				r=7;
				n=n-digit;
			}
			while(!isPrime(r))
			{
				r--;
			}
 
			s=r*digit+s;
			digit*=10;
			n/=10;
		}
		System.out.println(s);
	}
	public static boolean isPrime(int n){
		if(n<=1)
		 return false;
		for (int i=2;i*i<=n;i++){
			if(n%i==0)
			 return false;
		}
		return true;
	}
}
