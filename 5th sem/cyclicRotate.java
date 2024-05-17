// <!-- 1)Program to cyclically rotate an array by one

// Explanation: You have to take 2 inputs from the users 
// The first input is for your array elements
// The second input is for the number of rotation   -->

import java.util.Scanner;

public class cyclicRotate
{
    public static void main(String[] args) {
        int a[] = new int[args.length];
        for(int i=0; i<args.length; i++)
            a[i] = Integer.parseInt(args[i]);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the shift value: ");
        int shift = in.nextInt();
        a=rotate(a, shift);
        for(int i: a)
            System.out.print(i+ " ");
        in.close();
    }
    public static int[] rotate(int a[], int s)
    {
        for(int i=1; i<=s; i++)
        {   
            int temp = a[a.length-1];
            for(int j=a.length-1; j>0;j--)
            {
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
        return a;
    }
}
