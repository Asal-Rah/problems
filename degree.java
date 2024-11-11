import java.util.Scanner;
public class degree 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n-1];
        for( int i = 0 ; i < n-1 ; i++ ) {
            arr[i] = in.nextInt();
        }
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3;
        num3 = num2 - num1;
        int finalnum = 0;
        for( int i = (num1-1) ; i < (num2-1) ; i++ ) {
            finalnum += arr[i];

            

        }    
        System.out.print(finalnum);
    }
}