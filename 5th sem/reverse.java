// Problem No: 02
// Given integer x. Write a code to print its reverse.
// ReverseOfx(123) → 321
// ReverseOfx(-123) → -321
// ReverseOfx(406) → 604.

import java.util.Scanner;

class reverse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println(reverseof(n));
    }

public static String reverseof(String n){
    String rev="";
    for(int i=n.length()-1; i>=0; i-- ){
        char a = n.charAt(i);
        rev +=a;
    }
    return rev;
}
}