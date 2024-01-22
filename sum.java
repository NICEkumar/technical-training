import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.err.println(sumDouble(a,b));

    }
    public static int sumDouble(int a, int b)
    {
        if(a==b)
        return 2*(a+b);
        else 
        return a+b;
    }
}
 
