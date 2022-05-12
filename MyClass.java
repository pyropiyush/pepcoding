import java.util.Scanner;
public class MyClass {

    public static int max(int a1,int a2){

        if(a1>a2)
            return a1;
        else
            return a2;


    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int  i=sc.nextInt();
        int j= sc.nextInt();
        int k= max( i,j);
        System.out.println(k +"is Greater" );

    }
}