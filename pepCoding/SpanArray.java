package pepCoding;
import java.util.*;
public class SpanArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
           max= arr[i];
        }
    }
    int min=arr[0];
    for (int i=0;i< arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    int span=max-min;
        System.out.println(span);
    }

}


//import java.io.*;
//        import java.util.*;
//
//public class experiMent{
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//        int min=0;
//        int max=0;
//        for (int i=0;i<arr.length;i++){
//            min=arr[0];
//            max=arr[arr.length-1];
//
//        }
//        int big=max-min;
//        System.out.println(big);
//
//
//    }
//
//}