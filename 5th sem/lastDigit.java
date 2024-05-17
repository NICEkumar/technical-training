import java.util.*;
public class lastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.err.println(last(a,b));

    }
    public static boolean last(int a, int b)
    {
        return a%10 == b%10;
    }
}
