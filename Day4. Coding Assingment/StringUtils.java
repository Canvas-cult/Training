/****************************************************************
 * 
 * Make a StringUtils class which contains following methods
NOTE: You can use only String.charAt(), methods to code this problem.(Don't use any other inbuilt functions)
* static int countChar(String str,char ch)
- Returns occurrence of the given character in the given String (str).
* static String substring(String str,int start,int end)
- Returns a substring from the start index to end index with all validation checks.
* static String[] split(String str,char ch)
- Returns an array of strings broken according to the occurrence of the given character with validation checks.
* static Boolean hasPattern(String str,String pattern)
- Returns true if the give string (pattern) found in the main string (str) otherwise false.
* static Boolean allWordsContainsChar(String str,char ch)
- Returns true if all words of the given string (str) contains the given character (ch)  otherwise false.
static String reverse(String str)
- Returns the reverse of the String (Without using extra String or array)
static String reverseVowels(String str)
- Reverse only all the vowels in the string and return it ( Example : 
Input: s = "liipcoce"
Output: "leopcici"
Input: s = "hello"
Output: "holle"

 ******************************************************************/

import java.util.*;
public class StringUtils {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        
        char ch=sc.next().charAt(0);
        int start=sc.nextInt();
        int end=sc.nextInt();
        String pattern=sc.next();
        int count=countChar(str, ch);
        System.out.println(count);
        System.out.println(substring(str, start, end));
        String arr[]=new String[count+1];
        arr=split(str, ch);
        for(int itrator=0;itrator<arr.length; itrator++)
         System.out.print(arr[itrator]+",");
        System.out.println("\n"+hasPattern(str, pattern));
        System.out.println(allWordsContainsChar(str, ch));
        System.out.println(reverse(str));
        reverseVowels(str);
    }
     
    public static int countChar(String str,char ch){
        int count=0;
        int length= str.length();
        for(int itrator=0; itrator<length; itrator++){
            if(str.charAt(itrator)== ch)
             count++;
        }
        return count;
     }

     public static String substring(String str,int start,int end){
         String sub_String="";
         int length= str.length();
         for(int itrator =start; itrator<end; itrator++){
             sub_String+= str.charAt(itrator);
         }
         return sub_String;
     }

     public static String[] split(String str,char ch){
         
         int length=countChar(str,ch);
         String st[]= new String[length+1];
         st[0]="";
         int arr_itrator=0;
         for(int itrator=0;itrator<str.length();itrator++){
             
             if(str.charAt(itrator)!=ch)
                st[arr_itrator]+=str.charAt(itrator);
             else{ 
                 //System.out.println(st[arr_itrator]); 

                 ++arr_itrator;
                 st[arr_itrator]="";
             }

         }
         return st;
     }

     public static Boolean hasPattern(String str,String pattern){           
        //  int flag=1;
        //  for(int itrator=0;itrator<str.length(); itrator++){
        //      if(pattern.charAt(0)== str.charAt(itrator)){
        //          for(int pattern_itrator=1;pattern_itrator<pattern.length(); pattern_itrator++){
        //             if(pattern.charAt(pattern_itrator)!= str.charAt(itrator+pattern_itrator))
        //                 break;
        //             else{
        //                 ++flag;
        //                 if(pattern_itrator+1== flag)
        //                 return true;
        //             }
        //          }
        //          flag=1;
        //      }
        //  }
        //  return false;

        int m = pattern.length();
        int N = str.length();
  
        int lps[] = new int[m];
        int pattern_itrator = 0; // index for pat[]
  
        computeLPSArray(pattern, m, lps);
  
        int i = 0; // index for txt[]
        while (i < N) {
            if (pattern.charAt(pattern_itrator) == str.charAt(i)) {
                pattern_itrator++;
                i++;
            }
            if (pattern_itrator == m) {
                //System.out.println("Found pattern " + "at index " + (i - pattern_itrator));
                pattern_itrator = lps[pattern_itrator - 1];
                return true;
            }
  
            // mismatch after j matches
            else if (i < N && pattern.charAt(pattern_itrator) != str.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (pattern_itrator != 0)
                    pattern_itrator = lps[pattern_itrator - 1];
                else
                    i = i + 1;
            }
          }
            return false;
        }

     public static void computeLPSArray(String pat, int M, int lps[])
     {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else { 
                if (len != 0) {
                    len = lps[len - 1];
                }
                else
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

     public static Boolean allWordsContainsChar(String str,char ch){
         str=str+" ";
         int length= str.length();
         String wd="";
         for(int itrator=0;itrator<length; itrator++){
             char c= str.charAt(itrator);
             if(c!=' ')
              wd+=c;
             else
              {
                  if(countChar(wd, ch)<1)
               return false;
               wd="";
              }
         }
        return true;
     }

     public static String reverse(String str){
         int length=str.length();
         String ans="";
         
         for(int itrator=length-1; itrator>=0; itrator--){
            ans+= str.charAt(itrator);
         }
         return ans;
     }
     
     public static String reverseVowels(String str){
         String vowel="", ans="";
         int length=str.length();
         vowel=vowels(str);
         vowel=reverse(vowel);
         int itrator_vowel=0;
         for(int itrator=0; itrator<length; itrator++){
            char ch= str.charAt(itrator);
            //System.out.println(ans);
            if(ch!='a'&& ch!='e'& ch!='i'&& ch!='o'&& ch!='u')
                ans+=ch;
            else{ 
                ans+=vowel.charAt(itrator_vowel);
                itrator_vowel++;
            }
         }
         System.out.println(ans);
         return ans;
     }

     public static String vowels(String str){
         String vowel="";
         for(int itrator=0;itrator<str.length(); itrator++){
             char ch=str.charAt(itrator);
             if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
             vowel+=str.charAt(itrator);
         }
         //System.out.println(vowel);
         return vowel;
     }
}
