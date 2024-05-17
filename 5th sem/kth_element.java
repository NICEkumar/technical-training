// Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. 
// The task is to find the element that would be at the kth position of the final sorted array.

import java.util.Scanner;

public class kth_element
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in first array");
    int n = in.nextInt();
    int arr1[] = new int[n];
    System.out.println("Enter the elements");
    for(int i=0; i<n; i++)
        arr1[i] = in.nextInt();
    System.out.println("Enter the number of elements in second array");
    int m = in.nextInt();
    int arr2[] = new int[m];
    System.out.println("Enter the elements");
    for(int i=0; i<m; i++)
        arr2[i] = in.nextInt();
    int arr3[] = new int[m+n];
    arr3 = sort(merge(arr1, arr2));
    System.out.println("Enter the k value");
    int k = in.nextInt();
    kth(arr3, k);
    }
    public static int[] merge(int a[], int b[])
    {   
        int m=a.length, n=b.length;
        int c[] = new int[m+n];
        int k=0;
        for(int i=0; i<m; i++)
        c[k++]=a[i];
        for(int i=0; i<n; i++)
        c[k++]=b[i];
        return c;
    }
    public static void kth(int[] a, int k)
    {
        System.out.println(a[k-1]);
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
}