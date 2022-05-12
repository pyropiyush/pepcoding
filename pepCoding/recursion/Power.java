package pepCoding.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();

        int kd= PowerNew(x,n);
        System.out.println(kd);

    }
    public static int PowerNew(int x,int n ){
        if (n == 0){
            return 1;
        }

        int pf1= PowerNew(x,n-1);
        int pf=  x * pf1;
        return pf;
    }
}
