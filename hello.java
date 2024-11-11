import java.util.Scanner;
public class hello
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int length = str.length();
        char[] char1 = new char[length];
        for ( int u = 0 ; u < length ; u++) {
            char1[u] = str.charAt(u);
        }
        int number = 0;
        int num = 0;
        int number1 = 0;
        int num1 = 0;
        int number2 = 0;
        int num2 = 0;
        int number3 = 0;
        int num3 = 0;
        int number4 = 0;
        int num4 = 0;
        for ( int i = 0 ; i < length ; i++) {
            if ( char1[i] == 'h' ){
                number++;
                if ( number == 1) {
                    num = i;
                }
            }

        }
    if ( number > 0 ) {
        for ( int j = num+1 ; j < length ; j++) {
            if ( char1[j] == 'e') {
                number1++;
                if ( number1 ==1 ) {
                    num1 = j;
                }

            }
        }
    }
    if ( number1 > 0) {
        for ( int t = num1+1 ; t < length ; t++) {
        if ( char1[t] == 'l') {
             number2++;
             if ( number2 == 1 ) {
                 num2 = t;
             }
        }    
        }

    }
    if ( number2 > 0 ) {
        
        for ( int z = num2+1 ; z < length ; z++) {
            if ( char1[z] == 'l') {
                number3++;
                if ( number3 == 1 ) {
                    num3 = z;
                }
            }
        }
    }
    if ( number3 > 0 ) {
        for ( int p = num3 + 1 ; p < length ; p++ ) {
            if ( char1[p] == 'o') {
                number4++;
                if ( number4 == 1) {
                    num4 = p ;
                }
            }
        }
    }
    if ( number4 > 0 ) {
        System.out.println("YES");
    }
    else
        System.out.print("NO");

}
}