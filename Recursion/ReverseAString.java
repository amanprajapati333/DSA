
package RecursionPractice;

public class ReverseAString {

    public static void reverse(char[] name, int low, int high) {

        // Base case
        if (low >= high) {
            return;
        }

        // Swap characters
        char temp = name[low];
        name[low] = name[high];
        name[high] = temp;

       
        reverse(name, low + 1, high - 1);
    }


    public static void main(String[] args) {

        String str = "hello";

        char[] name = str.toCharArray();

        reverse(name, 0, name.length - 1);

        System.out.println(new String(name));
    }
}

