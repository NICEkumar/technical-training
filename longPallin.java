// given string S, return the possible longest palindrome substring from s.
// example 1:
// input s="babad", output bab or aba
// input s="cbbd", output "bb"

import java.util.Scanner;

public class longPallin
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.nextLine();
        String res= longest(s);
        System.out.println(res);
        in.close();
    }
    public static String longest(String s)
    {
        String res="";
        for(int i=0; i<s.length(); i++)
        {
            for(int j=i+1; j<s.length(); j++)
            {
                String sub = s.substring(i, j+1);
                if(palindrome(sub)&&sub.length()>res.length())
                    res=sub;
            }
        }
        return res;
    }
    public static boolean palindrome(String s)
    {
    for(int i =0, j=s.length()-1; i<=j; i++, j-- )
        if(s.charAt(i)!=s.charAt(j))
            return false;
        return true;
    }
}