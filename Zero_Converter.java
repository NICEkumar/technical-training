/*Problem No. 01
Zero Converter:
You are given a number n. The number n can be negative or positive. If n is negative, 
print numbers from n to 0 by adding 1 to n in the neg function. 
If positive, print numbers from n-1 to 0 by subtracting 1 from n in the pos function.
Note:- You don't have to return anything, you just have to print the array.
Example 1:
Input:
n = 0
Output:
already Zero
 
Example 2:
Input:
n = 4
Output:
3 2 1 0
 
Example 3:
Input:
n = -3
Output:
-3 -2 -1 0
 

Your Task:
This is a function problem. You need to take input of test cases. Just complete the functions pos() and neg().
Constraints:
-103 <= x <= 103
*/

import java.util.Scanner;

class Zero_Converter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the N value:\nn = ");
        n = in.nextInt();
        System.out.println();
        int choice = n==0?0:n>0?1:-1;
        switch (choice) {
            case 0:
                System.out.println("already Zero");
                break;
            case 1:
                pos(n);
                break;
            case -1:
                neg(n);
                break;
            default:
                break;
        }
    }
    public static void pos(int n){
        for(int i=n-1; i>=0; i--)
        System.out.print(i + " ");
        System.out.println();
    }
    public static void neg(int n){
        for(int i=n; i<=0; i++)
        System.out.print(i + " ");
        System.out.println();
    }
}
