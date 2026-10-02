class Solution {
    public int maxProduct(int[] nums) {

        int max1=0;
        int max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
    return (max1-1)* (max2-1);
        /*

        int max = 0;
        int max2 = 0;

        // Find maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Find second maximum
        boolean foundMax = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max && !foundMax) {
                foundMax = true;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return (max - 1) * (max2 - 1);
        */
    }
}