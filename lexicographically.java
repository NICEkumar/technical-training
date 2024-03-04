// Given a string S. 
// The task is to print all unique permutations of the given string that may contain dulplicates 
// in lexicographically sorted order. 

import java.util.Scanner;

public class lexicographically
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String s = in.nextLine();
        lexical(s, 0, s.length());
        in.close();
    }
    public static void lexical(String str, int start, int end)
    {
        if (start == end-1)  
        System.out.println(str);  
    else  
    {  
        for (int i = start; i < end; i++)  
        {  
            str = swapString(str,start,i);  
            lexical(str, start+1, end);
            str = swapString(str,start,i);  
        }  
    }  
    }
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
}