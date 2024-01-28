/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

*/

import java.util.Scanner;

class string_times{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string.");
        String s = in.nextLine();
        System.out.println("Enter a non negative number.");
        int n = in.nextInt();
        stringTimes(s,n);
    }
    public static void stringTimes(String s, int n){
        for(int i =0; i<n; i++)
        System.out.print(s);
        System.out.println();
    }
}