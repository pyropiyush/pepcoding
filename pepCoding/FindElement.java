package pepCoding;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int  n=sc.nextInt();
     int []arr=new int[n];
     for (int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     int element= sc.nextInt();
     int index=-1;
      for (int i=0;i<arr.length;i++){
        if (arr[i] == element){
            index=i;
            break;
        }
      }
        System.out.println(index);
    }
}
