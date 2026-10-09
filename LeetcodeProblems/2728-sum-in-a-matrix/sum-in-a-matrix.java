import java.util.Arrays;

class Solution {
public int matrixSum(int[][] nums) {
int m = nums.length;
int n = nums[0].length;


    for (int i = 0; i < m; i++) {
        Arrays.sort(nums[i]);
    }

    int score = 0;


    for (int j = 0; j < n; j++) {
        int maxx = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            maxx = Math.max(maxx, nums[i][j]);
        }

        score += maxx;
    }

    return score;
}


}
