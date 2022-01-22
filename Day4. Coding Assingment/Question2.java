/**************************************************
 * Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3

**************************************************/
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String current_max="", max="";
        int current_max_len=0, max_len=0;
        String str=sc.next();
        int length=str.length();

        for(int itrator=0; itrator<length; itrator++){
            char ch=str.charAt(itrator);

            System.out.println(current_max);

            if(contains(current_max, ch)){ 
                
                current_max+=ch;
                current_max_len=current_max.length();

                if(max_len < current_max_len)
                 { 
                      max=current_max;
                      max_len= current_max.length();
                 }
            }
            else
            {
                int start_index= current_max.indexOf(ch)+1;
                
                current_max=current_max.substring(start_index)+ ch;
               // current_max_len=1;
            }

        }
        System.out.println(max.length()+" "+max);

    }

    public static Boolean contains(String str,char ch){
        int count=0;
        int length= str.length();
        for(int itrator=0; itrator<length; itrator++){
            if(str.charAt(itrator)== ch)
             return false;
        }
        return true;
     }
}
