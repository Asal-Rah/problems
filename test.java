import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num= 1;
        int number = 1;
        while (number*num <= n)
        {
           number = number * num;
            num = num + 1;
        }
        int A = num - 1 ;
        System.out.print(A);
    }
}