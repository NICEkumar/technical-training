// Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively 
// i.e first element should be max value, second should be min value, third should be second max, 
// fourth should be second min and so on.
// Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

import java.util.Scanner;


public class rearrange
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = in.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements");
    for(int i=0; i<n; i++)
        arr[i] = in.nextInt();
    arr = reorder(arr);
    print(arr);
    }
    public static int[] reorder(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<arr.length/2; i++)
        {
            if(i%2==0)
            {
                arr[i] = arr[i]+arr[n-i-1];
                arr[n-i-1] = arr[i]-arr[n-i-1];
                arr[i] = arr[i]-arr[n-i-1];
            }
            else{
                arr[i] = arr[i]+arr[n-1];
                arr[n-1] = arr[i]-arr[n-1];
                arr[i] = arr[i]-arr[n-1];
            }
            
        }
        return arr;
    }
    public static void print(int[] arr)
    {
        for(int i:arr)
        System.out.print(i+ " ");
    }
}