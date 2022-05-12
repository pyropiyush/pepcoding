package pepCoding;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = methodDigit(n, d);
        System.out.println(methodDigit(n , d));
    }

        public static int methodDigit(int n,int d){
            int count =0;

            while (n>0){
                int dig=n%10;
                n=n/10;
                if(dig==d){
                    count++;
                }
            }
            return count;
    }
}

