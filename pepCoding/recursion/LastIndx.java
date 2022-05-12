package pepCoding.recursion;

import java.util.Scanner;

public class LastIndx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int d= sc.nextInt();
        int a=lastIndex(arr , 0 , d);
        System.out.println(a);
    }
    public static int lastIndex(int arr[] ,int idx , int d){
        if (idx == arr.length){
            return -1;
        }

        int liisa=lastIndex(arr, idx+1, d);
        if (liisa == -1){
            if (arr[idx] == d){
                return idx;
            }
            else {
                return -1;
            }

        }else {
            return liisa;
        }
    }
}
