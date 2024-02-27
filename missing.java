// QUESTION-01
// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
// Example 1:
// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.

import java.util.Scanner;

public class missing
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n= in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        arr[i] = in.nextInt();
        sort(arr);
        // print(arr);
        missing_no(arr);
        twice(arr);
    }
    public static int[] sort(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
            for(int j=i; j<n; j++)
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        return arr;
    }
    public static void print(int[] arr)
    {
        for(int i:arr)
        System.out.print(i+ " ");
    }
    public static void missing_no(int []arr)
    {
        for(int i=1; i<arr.length; i++)
            if(i!=arr[i-1])
            {
                System.out.println("Missing Number: "+i);
                return;
            }
    }
    public static void twice(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
            if(arr[i]==arr[i+1])
            {
                System.out.println("Repeating Twice: "+ arr[i]);
                return;
            }
    }
}
