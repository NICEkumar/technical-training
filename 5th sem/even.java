import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println(check(a));
    }
    public static boolean check(int a)
    {
        return a%2 == 0;
    }
}
