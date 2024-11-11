import java.util.Scanner;
public class memory 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        String str = in.next();
        int length = str.length();
        int num = 0;
        char[] char1 = new char[length];
        for ( int i = 0 ; i < n ; i++) {
            arr[i]=0;
        }
        for ( int i = 0 ; i <  length ; i++) {
        char1[i] = str.charAt(i);
        if (  char1[i] == '+') {
            arr[num] += 1;
            
        }
        if ( char1[i] == '-') {
            arr[num] -= 1;
        }
        if ( char1[i] == '>' ) {
           num++;
           num = num % n;
        }
        if ( char1[i] == '<' ) {
             num--;
            if ( num < 0 ) {
                num = num + n ;
                num = num % n;
                
            }
            if ( num > 0 ) {
            num = num % n;
            
            }
        }
        
       

    }
     for ( int j = 0 ; j < n ; j++) {
            System.out.print(arr[j]);
            System.out.print(" ");
        }
    }


}