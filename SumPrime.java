/*
Given two int values a and b. Check a and b are primes are not.
If a and b are primes then check if the sum of a and b is a prime or not.
If the prime returns true. Else return false.
SumPrime(2,3) —> true.
SumPrime(7,11) —> true.
SumPrime(3,7) —> false
SumPrime(8,11) → false
*/

import java.util.Scanner;

class SumPrime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(isPrime(a,b));
    }
    public static boolean isPrime(int a, int b)
    {
        return prime(a)&&prime(b)&&prime(a+b);
    }
    public static boolean prime(int n)
    {
        for(int i = 2; i < n/2 ; i++)
            if(n%i == 0)
                return false;
        return true;
    }
}
