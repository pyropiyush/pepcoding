package pepCoding;

import java.util.*;

import java.util.* ;
public class TwoArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int []a1 =new int[n1];
        for(int i=0;i< a1.length ; i++){
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[]a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]= sc.nextInt();
        }
        int []sum=new int[n1>n2 ? n1 : n2];
        int carry=0;
        int a=a1.length-1;
        int b=a2.length-1;
        int son=sum.length-1;

        while(son >= 0){
            int d=carry;
            if (a>=0){
                d+=a1[a];
            }
            if (b>=0){
                d+=a2[b];
            }
            carry=d/10;
            d=d%10;
            sum[son]=d;
            a--;
            b--;
            son--;
        }
        if(carry != 0){ 
            System.out.println(carry);
        }
        for(int val:sum){
            System.out.println(val);
        }

    }
}