package pepCoding;

import java.util.Scanner;

public class DecimaltoBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int base= sc.nextInt();
        int ans=DecimalTobase(number,base);
        System.out.println(ans);

    }
    public static int DecimalTobase(int number,int base){
        int count=0;
        int p=1;
        while (number !=0){
            int rem= number % base;
            number=number/base;
            count += rem *p;
                   p=p*10;
        }
        return  count;
    }
}
