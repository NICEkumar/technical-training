// Given an array of n distinct elements. 
// Find the minimum number of swaps required to sort the array in strictly increasing order.

import java.util.Scanner;

public class minSwaps
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value.");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0; i<n; i++)
            a[i]= in.nextInt();
        calSwaps(a);
        in.close();
    }
    public static void calSwaps(int arr[])
    {
        int n = arr.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
        System.out.println("Minimum number of swaps required: " + swaps);
    }
    }
