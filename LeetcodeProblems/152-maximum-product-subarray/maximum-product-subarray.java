class Solution {
    public int maxProduct(int[] nums) {
        
        int maxproduct=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i; j<nums.length; j++){
                product=product*nums[j];
                maxproduct=Math.max(product, maxproduct);
            }
            product=1;
        }
        return maxproduct;
        
    }
}