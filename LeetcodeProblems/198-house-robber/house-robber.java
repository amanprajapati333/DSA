class Solution {
    public int rob(int[] nums) {

    int pre1=0;
    int prev2=0;
    for(int money:nums){
        int current=Math.max(pre1,prev2+money);
        prev2=pre1;
        pre1=current;
    }
    return pre1;
        
    }
}