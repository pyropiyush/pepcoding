package pepCoding;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Subarray {



        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j <= arr.length; j++) {
                    for (int k = i; k < j; k++) {

                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }

            }
        }

    }
