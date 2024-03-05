// givn an array of intergers X with n number fo elements and an interger, target T, 
// return the indices of the numbers such tahta the sum of the two numbers is equal to target T.
//  you may assume that each input would have exactly one solution, and you may not use the same element twice
//  you can return answer in order.
//  input: X= [2,7,11,15] t=9
//  output:[0,1]

import java.util.Scanner;

public class twosum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++)
            a[i]=in.nextInt();
        System.out.println("Enter the target: ");
        int t = in.nextInt();
        two(a, t);
        in.close();
    }
    public static void two(int[]a, int t)
    {
        int n = a.length;
        int solution[] = new int[2];
        for(int i=0; i<n-1; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(a[i]+a[j]==t)
                {
                    solution[0]=i;
                    solution[1]=j;
                    
                }
            }
        }
        print(solution);
    }
    public static void print(int a[])
    {
        for(int i:a)
        System.out.print(i + " ");
    }
}