/********************************************
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 ********************************************/

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]= new int[n];
        int m=sc.nextInt();
        int arr2[]= new int[m];
        for(int itrator=0; itrator<n; itrator++)
            arr1[itrator]= sc.nextInt();

        for(int itrator=0; itrator<m; itrator++)
            arr2[itrator]= sc.nextInt();

            //merge the array
         mergeArray(arr1, arr2, n, m);

         //to display merged array
        //  for(int i=0; i<n; i++)
        //    System.out.print(arr1[i]+" ");
        // System.out.println();
        // for(int i=0; i<m; i++)
        //    System.out.print(arr2[i]+" ");

         int size=n+m;
         int median=0;
          if(size%2==1){                     // if size is odd then only 1 median exists
              if(size/2 <n)                  //  median is in 1st array
               System.out.println(arr1[size/2]);
              else                           // median is in 2nd array
               System.out.println(arr2[m-(size/2)-1]);
           }
         else                               //if size is even then average of 2 middle elements is the median
              {
                 if(size/2 < n)
                 {                           // both the elements are in 1st array
                      median= (arr1[size/2-1] + arr1[size/2])/2;
                     System.out.println(median);
                 }
                 else if(size/2-1 >n )        // both the elements are in 2nd array
                 {
                    median= (arr2[size/2-1 -n] + arr2[size/2]- n)/2;
                    System.out.println(median);
                 }
                 else{                         // 1st element is in last of 1st array and 2nd element is in starting of 2nd array
                     median= (arr1[n-1] + arr2[0])/2;
                  System.out.println(median);
                 }
              }
    }

    //function to merge the array without extra space
    public static void mergeArray(int arr1[], int arr2[], int n, int m){
        int arr1_itrator=0, arr2_itrator=0;
        while( arr1_itrator<n && arr2_itrator <m){
            if(arr1[arr1_itrator] <= arr2[arr2_itrator])      // elements are sorted no need to change
               arr1_itrator++;
            else if(arr1[arr1_itrator] > arr2[arr2_itrator] ) // elements need to swap
            {
                int temp= arr1[arr1_itrator];
                arr1[arr1_itrator] = arr2[arr2_itrator];
                arr2[arr2_itrator]= temp;
                arr1_itrator++;
                if(arr2_itrator < m-1 && arr1[arr2_itrator+1] < arr2[arr2_itrator]){
                    int temp_arr2 = arr2[arr2_itrator];
                    int tempj= arr2_itrator+1;

                    while( tempj< m && arr2[tempj]< temp_arr2 && tempj <m){         // to sort array of 2nd Array 
                        arr2[tempj -1] = arr2[tempj];
                         tempj++;
                    }
                    arr2[tempj-1] = temp_arr2;
                
                }
            }
        }
    }
}
