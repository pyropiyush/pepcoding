package pepCoding;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armStrong(n));
    }
public static int CountDigit(int n){
        int count =0;
        while (n !=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean armStrong(int n){
      int d=CountDigit(n);
      int ans =0;
      int temp=n;
        while (n != 0){
            int rem= n%10;
           ans = ans+ (int)Math.pow(rem,d);
            n= n/10;
        }
        if (temp == ans ){
            return true;
        }
        else {
            return false;
        }
    }
}
