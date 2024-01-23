import java.util.*;
public class makes10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.err.println(makes(a,b));

    }
    public static boolean makes(int a, int b)
    {
        return a==10 || b==10 || a+b == 10;
    }
}
 
