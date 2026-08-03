
package RecursionPractice;

public class PalindroneNum {

    static int reverse = 0;

    public static int reverseNumber(int num) {

        if (num == 0) {
            return reverse;
        }

        int digit = num % 10;
        reverse = reverse * 10 + digit;

        return reverseNumber(num / 10);
    }

    public static boolean palindrome(int num) {

        int original = num;

        reverse = 0;

        int reversed = reverseNumber(num);

        return original == reversed;
    }

    public static void main(String[] args) {

        int num = 121;

        if (palindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

