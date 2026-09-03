
class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums1) {
            min = Math.min(min, num);

            if (num % 2 != 0) {
                hasOdd = true;
            }
        }

        // If minimum is odd, we can make everything odd.
        // If there are no odd numbers, everything is already even.
        if (min % 2 != 0 || !hasOdd) {
            return true;
        }

        return false;
    }
}

