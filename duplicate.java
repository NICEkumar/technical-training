// Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.
// Example 1:
// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
 

import java.util.Scanner;

public class duplicate
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        arr[i] = in.nextInt();
        System.out.println("Enter the X value");
        int x = in.nextInt();
        find(arr, x);
    }
    public static void find(int[] arr, int x)
    {
        int first=0, last=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]==x)
            {
                first=i;
                break;
            }
        for(int i=arr.length-1; i>=0; i--)
            if(arr[i]==x)
            {
                last=i;
                break;
            }
            System.out.println("First occurrence of "+x+" is at index "+first+" and last occurrence of "+x+" is at index "+last);
    }
}
