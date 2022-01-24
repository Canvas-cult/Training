
import java.util.*;
public class Question4 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		if(s.startsWith("http://") || s.startsWith("https://"))
		   if(s.endsWith(".org") || s.endsWith(".com") || s.endsWith(".in"))
		      System.out.println("Valid");
		else
		   System.out.println("Invalid");
	}
}
