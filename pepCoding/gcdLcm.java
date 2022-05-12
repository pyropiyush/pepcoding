package pepCoding;



import java.util.*;
public class gcdLcm{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0;
        int second=1;
        for(int i=1;i<=n;i++) {
      for (int j=1;j<=i;j++){
          System.out.print(first +"\t");
         int c=first+second;
         first=second;
         second=c;


      }
            System.out.println();
        }




        }



}