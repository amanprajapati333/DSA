class Solution {
    public String reverseOnlyLetters(String s) {
        int low = 0;
        int high = s.length() - 1;
        char[] arr = s.toCharArray();

        while (low < high) {

            if (!Character.isLetter(arr[low])) {
                low++;
            }
            else if (!Character.isLetter(arr[high])) {
                high--;
            }
            else {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        return new String(arr);
    }
}