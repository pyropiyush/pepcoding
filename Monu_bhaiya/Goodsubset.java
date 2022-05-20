package Monu_bhaiya;

import java.util.Scanner;

public class Goodsubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(goodSubset(arr));

    }
    public static int goodSubset(int []arr){
         int newarr[]=new int[arr.length];

         for (int i=0;i< arr.length;i++){
             for (int j=i;j<arr.length;j++){
                 newarr[j] = newarr[j] + arr[j];
                 if (arr[j] % arr.length == 0){
                     return newarr[j];
                 }
             }
         }
         return newarr[arr.length];
    }
}
