import java.util.Scanner;
public class triangle 
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int angle1 = in.nextInt();
    int angle2 = in.nextInt();
    int angle3 = in.nextInt();
    if ( angle1 + angle2 + angle3 == 180) {
        if ( angle1 == 0 || angle2 == 0 || angle3 == 0) {
            System.out.print("No");
        }
        else {
            System.out.print("Yes");
        }

    }
    else {
        System.out.print("No");
    }

    }
}