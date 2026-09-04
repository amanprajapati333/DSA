class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int max = nums[0];
            int min = nums[i];

            // Maximum in nums[0...i]
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            // Minimum in nums[i...n-1]
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }
}