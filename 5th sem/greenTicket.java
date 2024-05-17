// You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
// the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
// the result is 10.

// greenTicket(1, 2, 3) → 0
// greenTicket(2, 2, 2) → 20
// greenTicket(1, 1, 2) → 10

import java.util.Scanner;

public class greenTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("result: "+green(a, b, c));
        sc.close();
    }
    static int green(int a, int b, int c){
        int result = 0;
        if(a==b && b==c)
            result = 20;
        else if(a==b || a==c || b==c)
            result = 10;
        return result;
    }
}
