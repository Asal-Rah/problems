import java.util.Scanner;
public class team
{
    public static void main(String[] args)  {
   
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    int num4 = in.nextInt();
    int num5 = in.nextInt();
    int num6 = in.nextInt();
    int number;
    number = Math.min(num1 , num2 ) + Math.min(num3 , num4) + Math.min(num5 , num6);
    System.out.print(number);
}
}