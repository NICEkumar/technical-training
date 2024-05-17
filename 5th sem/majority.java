// Given an array A of N elements. Find the majority element in the array. 
// A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.

import java.util.Scanner;

public class majority
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = in.nextInt();
        System.out.println("Enter the elements");
        int a[] = new int[n];
        for(int i=0; i<n;i++)
            a[i]=in.nextInt();
        int majority = majority(a, n);
        System.out.println(majority);
    }
    public static int majority(int[] nums, int n)
    {
    Integer ans = null;
    int count = 0;
    for (final int num : nums) {
      if (count == 0)
        ans = num;
      count += num == ans ? 1 : -1;
    }

    return ans;
    }
}