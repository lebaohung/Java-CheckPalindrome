public class Main {
    public static void main(String[] args) {
        String str = "AAAABcabaaaa";

        CheckPalindrome checkPalindrome = new CheckPalindrome(str);
        if (checkPalindrome.check()) {
            System.out.println("The given string is Palindrome!");
        } else {
            System.out.println("The given string is not Palindrome!");
        }

    }
}
