// given a string s and return true if the given string is unique string else return false.
// A string which contain each char for only one time is know as a unique string.
// input 1: s=abc->true
// input 2: s=ABC123abc->true
// input 3: s=abc@abc->false

import java.util.Scanner;

public class uniqueStrings
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.nextLine();
        System.out.println(uniques(s));
        in.close();
    }
    public static boolean uniques(String s)
    {
        int n = s.length();
        // for(int i=0; i<n-1; i++)
        // {
        //     for(int j=i+1; j<n; j++)
        //     {
        //         if(s.charAt(i)==s.charAt(j))
        //         return false;
        //     }
        // }
        // return true;
        for(int i=0; i<n; i++)
        {
            if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
            return false;
        }
        return true;
    }
}