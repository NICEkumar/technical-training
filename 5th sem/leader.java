// Given an array A of positive integers. 
// Your task is to find the leaders in the array. 
// An element of array is a leader if it is greater than or equal to all the elements to its right side. 
// The rightmost element is always a leader. 

import java.util.Scanner;

class leader{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value.");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0; i<n; i++)
            a[i]= in.nextInt();
        leader_check(a);
        in.close();
    }
    public static void leader_check(int []a)
    {
        int n =a.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n;j++)
            {
                if(a[i]<a[j])
                break;
                if(j==n-1)
                System.out.println(a[i]);
            }
        }
    }
}