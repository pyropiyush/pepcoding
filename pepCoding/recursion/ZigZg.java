package pepCoding.recursion;

import java.util.Scanner;

public class ZigZg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        gigZag(x);
    }
    public static void gigZag(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        gigZag(n-1);
        System.out.println(n);
        gigZag(n-1);
        System.out.println(n);
    }

}
