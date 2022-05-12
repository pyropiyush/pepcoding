import java.util.Scanner;

class AnalyzeNumbera{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        double [] number= new double[n];
        double result=0;

        for (int i=0;i<n;i++){
            number[i]=input.nextDouble();
            result=result+number[i];

        }
        double average=result/n;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(number[i]>average)
                count++;

        }
        System.out.println(average);
        System.out.println(count);

    }
}