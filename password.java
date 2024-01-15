// Use Case 01:password checking 


// Give a string (password). And check if it is a valid password as per given following rules if yes print 1 else print 0

// Rules:
// Password should  be a minimum of 8 characters in length .
// Password should contain at least one uppercase , one lower case , one special character and one digit 
// It should not contain white space.
import java.util.*;
class password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.nextLine();
        if(check(password))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    static boolean check(String password){
        boolean noSpace = true, hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        int length = password.length();
        if(length<8)
            return false;
        for(char c :password.toCharArray()){
            if(c == ' ')
                noSpace = false;
            if(Character.isUpperCase(c))
                hasUpper = true;
            if(Character.isLowerCase(c))
                hasLower = true;
            if(Character.isDigit(c))
                hasDigit = true;
            if(isSpecialCharacter(c))
                hasSpecial = true;
        }
        
        return noSpace && hasDigit && hasLower && hasSpecial && hasUpper;
    }
    private static boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-+{}[]|:;";
        return specialCharacters.contains(String.valueOf(ch));
    }
    
}
