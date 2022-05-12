package pepCoding.recursion;

import java.util.Scanner;

public class DecresingIncreasing {



        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            decRease(n);
        }
        public static void decRease(int n){
            if (n == 0){
                return ;
            }

            System.out.println(n);
            decRease(n-1);


            System.out.println(n);

        }


}
