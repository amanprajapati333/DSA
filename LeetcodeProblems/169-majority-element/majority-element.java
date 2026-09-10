class Solution {


   // Moore Alogoritham
    public int majorityElement(int[] nums) {

        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
                  count = 1; 
            }
            else if (num==candidate){
                count+=1;
            }
            else{
                count--;
            }
        }
    return candidate;



        /*
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n/2){
                return nums[i];
            }
        }

        return -1;
        */
    }
}