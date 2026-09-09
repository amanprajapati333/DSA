class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       // int count=0;
        int count1=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
            }else{
               count1=0;
            }
          
            max1=Math.max(max1,count1);
        }
        return max1;
    }
}