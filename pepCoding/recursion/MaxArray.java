package pepCoding.recursion;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int m=maxElement(arr,0);
        System.out.println(m);
    }
    public static int maxElement(int []arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int misa=maxElement(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }

    }
}
