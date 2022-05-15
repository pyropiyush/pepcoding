package Leetcode;

import java.util.Scanner;

public class Rotate189 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        FullReverse(arr,k);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    public static void FullReverse(int arr[],int k){
        k=k % arr.length;
        int n=arr.length;
            funcReverse(arr,0,n-k-1);  // n-k ko reverse
            funcReverse(arr,n-k,n-1);   //last k ko reverse
            funcReverse(arr,0,n-1);    //whole arrray reverse
    }
    public static void funcReverse(int []arr,int i,int j){
                while(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
    }

}
