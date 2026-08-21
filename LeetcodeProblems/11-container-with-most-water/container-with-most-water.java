class Solution {
    public int maxArea(int[] height) {

        int low=0;
        int high=height.length-1;
        int maxwater=0;
        while(low<high){
            int width=high-low;
            int waterlevel=Math.min(height[low],height[high]);
            int area=width*waterlevel;
            maxwater=Math.max(maxwater,area);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
            
        }
        return maxwater;
        
    }
}