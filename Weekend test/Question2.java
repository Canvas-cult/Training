/*************************************************************************************
 * Find all interleavings of given strings that can be formed from all the characters of the first and second string where the order of characters is preserved.
 *************************************************************************************/

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        int index=0;
        String st="";
        int str1_len=str1.length();
        int str2_len= str2.length();

        interleaving(str1, str1_len, index, str2, str2_len, index, st);
    }

    // Recurssive function to generate string 
    //using backtracking
    public static void interleaving(String str1, int str1_len, int str1_itrator,  String str2, int str2_len, int str2_itrator, String st){
        
        if(str1_itrator== str1_len && str2_itrator== str2_len)      //base case  --> terminate
            System.out.println(st);

        if(str1_itrator< str1_len)                                 //itrative case  --> recurssive call
            interleaving(str1, str1_len, str1_itrator+1, str2, str2_len, str2_itrator, st+str1.charAt(str1_itrator));

        if(str2_itrator< str2_len)                                 //itrative case  --> recurssive call
            interleaving(str1, str1_len, str1_itrator, str2, str2_len, str2_itrator+1, st+str2.charAt(str2_itrator));
            
    }
    
}
