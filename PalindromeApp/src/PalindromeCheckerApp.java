/*
Use Case 3: Palindrome Check Using String Reverse

Description :

This is the use case 3 part of the app
This class demonstrates whether a string is palindrome or not by reversing the string
and comparing it with the original string

our goal is to check whether a string is a palindrome by reversing it.

@author - utkarsh
@version - 3.0

*/
public class PalindromeCheckerApp{
    public static void main(String[] args) {

        String input = "radar";

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
 UC4
}
=======
}
main
