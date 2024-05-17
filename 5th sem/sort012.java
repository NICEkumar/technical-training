// )Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


// Example 1:

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.
// Example 2:

// Input: 
// N = 3
// arr[] = {0 1 0}
// Output:
// 0 0 1
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

import java.util.*;
public class sort012
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        System.out.println("Enter the elements");
        int a[] = new int[n];
        for(int i=0; i<n;i++)
            a[i]=in.nextInt();
        a= sort(a, n);

    }
    public static int[] sort(int []a, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) 
            {
                int temp = 0;
                if (a[j] < a[i]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;   
}
}