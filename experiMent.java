import java.util.*;
public class experiMent {


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int search= sc.nextInt();
        System.out.println(minCount(arr,search));
    }
    public static int minCount(int arr[],int search){
        int min =-1;
            for (int i=1;i<arr.length;i++){
                if (arr[i] == search) {
                    min=  i;
                    return min;


                }

            }return min;
    }
}