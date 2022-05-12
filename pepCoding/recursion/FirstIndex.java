package pepCoding.recursion;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n= sc.nextInt();
        int []arr=new int[n];

        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int x= sc.nextInt();
        int m=FindIndex(arr,0,x);
        System.out.println(m);


    }
    public static int FindIndex(int arr[],int idx,int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = FindIndex(arr, idx + 1, x);
            return fiisa;
        }
    }

}
