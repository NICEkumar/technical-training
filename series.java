/*
We use the integers a, b, and n to create the following series:
(a+2^0 *b), (a+2^0 *b+2^1*b), (a+2^0 *b+2^1*b +2^2*b), …… (a+2^0 *b+2^1*b+2^2*b+.... + 2^n-1 * b)  
You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of space-separated integers.
Input Format:  The first line contains an integer, q denoting the number of queries.
Each line i  of the q subsequent lines contains three space-separated integers describing the respective ai, bi, ni, and values for that query.
 
Constraint:
0<=q<=500
0<=a,b<=50
0<=n<=15
 
Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of space-separated integers.
 
Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] resultSeries = generateSeries(a, b, n);
            for (int term : resultSeries) {
                System.out.print(term + " ");
            }
            System.out.println();
        }
    }

    public static int[] generateSeries(int a, int b, int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            series[i] = a + (int) Math.pow(2, i) * b;
        }
        return series;
    }
}