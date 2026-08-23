class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return totalSum - sum;
    }
}


/*
         int xor = nums.length;

        for(int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
         /*
         Not Good
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=i){
            return i;
           }
        }
        return -1;

        ________________
        All Test Case Pass
       
        for(int i = 0; i <= nums.length; i++) {
            int flag = 0;
            
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0) {
                return i;
            }
        }
        return -1;
        
    }
}
*/
        