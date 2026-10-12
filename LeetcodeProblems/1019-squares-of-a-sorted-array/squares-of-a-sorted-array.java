class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }

            i--;
        }

        return result;
    }
}

        /*
        time compplexity ==(nlog n) time and space 0(n) times
        int result[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]*nums[i];

        }
        Arrays.sort(result);
        return result;
        
    }
}
*/