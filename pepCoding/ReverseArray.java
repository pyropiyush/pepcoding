package pepCoding;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i1= sc.nextInt();
        int j1= sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Arrayreverse(arr,i1,j1);

        }
        public static void Arrayreverse(int arr[],int i1,int j1){
        int i=i1;
        int j= j1 ;
        while(i<j){
            int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;

        }
        for ( i=0;i< arr.length;i++) {
            System.out.println(arr[i] + "   ");

        }return ;
    }
}
