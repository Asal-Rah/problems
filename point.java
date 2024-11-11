import java.util.Scanner;
public class point 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        for ( int i = 0 ; i < n ; i++) {
            X[i] = in.nextInt();
            Y[i] = in.nextInt();
        }
        int x = 0 ; int y = 0;
        for ( int i = 0 ; i < n ; i++) {
            if ( X[i] > 0) {
                x++;
            }
            if (X[i] < 0) {
                y++;
            }
        }
        if (  y == 1  ) {
            System.out.print("Yes");
        }
        else if ( x == n ) {
            System.out.print("Yes");
        }
         else if ( y == n) {
            System.out.print("Yes");
        }
         else if ( x == 1 ) {
            System.out.print("Yes");
        }
        
        else {
            System.out.print("No");

        }
    }
}