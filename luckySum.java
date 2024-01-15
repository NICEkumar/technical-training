
// Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

// luckySum(1, 2, 3) → 6
// luckySum(1, 2, 13) → 3
// luckySum(1, 13, 3) → 1

import java.util.*;
public class luckySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Sum:"+lucky(a, b, c));
        sc.close();
    }
    public static int lucky(int a, int b, int c){
        int sum = 0;
        if(a!=13){
            sum += a;
            if(b!=13){
                sum += b;
                if(c!=13){
                    sum += c;
                }
            }
        }
        return sum;
    }
}
