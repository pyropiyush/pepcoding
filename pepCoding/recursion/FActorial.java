package pepCoding.recursion;
import java.util.*;
public class FActorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=facTorial(n);
        System.out.println(m);
    }
    public static int facTorial(int n){
if(n == 1){
    return 1;
}
        int fn=facTorial(n-1);
        int fact=n * fn;
        return fact;


    }
}
