
package RecursionPractice;

public class powerCalculation {

    public static int power(int base, int exponent) {

        // Base case
        if (exponent == 0) {
            return 1;
        }

        // Recursive case
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}

