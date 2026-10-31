class Solution {
    public int distinctAverages(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);

        int low=0;
        int high=nums.length-1;
        int result=0;
        while(low<high){

            set.add(nums[low]+nums[high]);
            low++;
            high--;
            
        }
        return set.size();
    }
}