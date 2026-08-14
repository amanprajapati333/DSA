class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int currentGap = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            currentGap = Math.max(currentGap, nums[i + 1] - nums[i]);
        }

        return currentGap;
    }
}