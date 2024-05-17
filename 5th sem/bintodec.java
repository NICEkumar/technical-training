// Given positive integer x. Write a program to print a Binary number of x.
// BinaryNum(23) → 10111
// BinaryNum(124) → 1111100
// BinaryNum(234) → 11101010

import java.util.Scanner;

class bintodec
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        b2d(n);
    }
    static void b2d(String n){
        System.out.println(Integer.parseInt(n,2));
    }
}