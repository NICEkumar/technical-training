// Given a string S consisting of lowercase Latin Letters. 
// Return the first non-repeating character in S. 
// If there is no non-repeating character, return '$'

import java.util.Scanner;

public class repeating {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String s = in.nextLine();
        nonrepeating(s);
        in.close();
    }

    public static void nonrepeating(String s)
    {
        int n =s.length();
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                break;
                if(j==n-1)
                {
                System.out.println(s.charAt(i));
                System.exit(0);
            }
            }
            
        }
    }

}