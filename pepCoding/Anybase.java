package pepCoding;

import java.util.Scanner;

public class Anybase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int b1= sc.nextInt();
        int b2= sc.nextInt();
        int ans=anyToany(n,b1,b2);
        System.out.println(ans);
    }
        public static int anyToany(int n,int b1, int b2){
            int count=0;
            int p=1;
            while (n != 0){
                int rem=n % b2;
                n=n/b2;
                count += rem * p;
                p=p*b1;
            }
            return count;
        }
}
