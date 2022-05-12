package pepCoding;

import java.util.Scanner;

public class BasetoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int b= sc.nextInt();
        int ans=baseTodecoimal(n,b);
        System.out.println(ans);
    }
    public static int baseTodecoimal(int n ,int b){
     int count=0;
     int p=1;
     while (n !=0){
         int rem=n%10;
         n=n/10;
          count += rem * p;
          p=p*b;
     }
     return count;
    }
}
