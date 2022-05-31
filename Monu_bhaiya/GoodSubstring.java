package Monu_bhaiya;

import java.util.Scanner;

public class GoodSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int a=subString(st);
        System.out.println(a);
    }
    public static int subString(String str){
            int count=0;
            int ans=0;
            for (int i=0;i< str.length();i++) {
                char ch = str.charAt(i);
                if (voWels(ch) == true) {
                    count++;
                } else {
                    ans = Math.max(ans, count);
                    count = 0;
                }
            }
                ans=Math.max(ans,count);
                return ans;
            }

    public static boolean voWels(char ch){
        if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            return true;
        }
        return false;
    }
}
