/**********************************************************
 * Write down a method boolean isNameValid(String  name).
 *********************************************************/
import java.util.*;
public class Question1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0,ss=0;
		int l=s.length();
		System.out.println(isNameValid(s,l));
		
	}
    public static boolean isNameValid(String s, int l){
        int flag=0,ss=0;
        //System.out.println(vowel(s));
        if(vowel(s)){
			for(int i=0;i<l;i++){
				char ch=s.charAt(i);
				if(ch=='S' ) ss++;
				if(ch=='T' && ss%2!=0) {
 
				  flag=1;
				 break;
				}
			}
		}
        if(flag==1 || !vowel(s))
		 return false;
		else
		 return true;
    }
	public static boolean vowel(String s){
		int l=s.length();
		int a=0,e=0,ii=0,u=0,o=0;
		for(int i=0;i<l;i++){
			char ch=s.charAt(i);
			switch(ch){
			    case 'a': a++;
				      break;
				case 'e':e++;
				      break;
				case 'i': ii++;
				      break;
				case 'o': o++;
				      break;
				case 'u': u++;
				    break;
				default: 
			}
		}
		if(a<=1 && e<=1 && ii<=1 && o<=1 && u<=1)
		    return true;
		else
		      return false;
 
	}
}
