package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Average1491 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
       double ans=average(arr);
        System.out.println(ans);


    }
    public static double average(int [] salary){
        double a=0;
        Arrays.sort(salary);
        for (int i=1;i<salary.length-1;i++){
            a= a+salary[i];
        }
        return a/(salary.length-2);
    }

}
