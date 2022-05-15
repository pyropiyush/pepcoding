package Monu_bhaiya;

import java.util.Scanner;

public class Find_element_in_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][]arr=new int[r][c];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ele= sc.nextInt();
        int ans=findElement(arr,ele);
        System.out.println(ans);

    }
    public static int findElement(int arr[][],int ele){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i][j] == ele){
                   return 1;
                }

            }
        }
        return 0;
    }
}
