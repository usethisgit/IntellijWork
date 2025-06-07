// Determine a given string is a palindrome or not.

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "dad";
        boolean result = isPalindrome(s);
        System.out.println("given string is "+ result);
    }
}
