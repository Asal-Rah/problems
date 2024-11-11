import java.util.Scanner;
public class figure 
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long number = in.nextLong();
        long answer;
        answer = plus(number);
        if (answer >= 10) {
            do {
             answer = plus(answer);
            }
            while ( answer>=10);
            System.out.print(answer);
        }
        else
        System.out.print(answer);

        
    }
    public static long plus(long number) 
{
        long A;
        long D;
        long C =0;
        while ( number > 0) {
    
           A = number % 10;
           number = number / 10;
           C += A ;
           
        }
        return C;
}
}
