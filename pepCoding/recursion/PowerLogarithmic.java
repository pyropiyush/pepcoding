package pepCoding.recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x= sc.nextInt();
        int xs=logPower(x,n);
        System.out.println(xs);


    }
    public static int logPower(int x,int n){
        if (x ==0){
            return 1;
        }

        int xpb2=logPower(x,n-1);
        int xp=xpb2*xpb2;

        if (n %2==1){
            xp=xp*x;
        }
        return xp;
    }
}
