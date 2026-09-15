
class Solution {
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

          
            if ((mid == 0 || nums[mid - 1] != nums[mid]) &&
                (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }

            if (mid % 2 == 0) {

                if (nums[mid] == nums[mid + 1]) {
                  
                    start = mid + 2;
                } else {
                   
                    end = mid - 1;
                }

            } else {

                if (nums[mid] == nums[mid - 1]) {
                   
                    start = mid + 1;
                } else {
                    
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}



/*class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}

  /*
class Solution {
    public int singleNonDuplicate(int[] nums) {
      
          int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
        
    }
}
*/