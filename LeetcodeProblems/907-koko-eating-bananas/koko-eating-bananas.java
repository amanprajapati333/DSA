class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
       int low=1;
       int high=maxi;
       while(low<=high){
           int mid = low + (high - low) / 2;
            int hours = 0;
            for(int i=0;i<piles.length;i++){

                hours += Math.ceil((double) piles[i] / mid);
            }
            if(hours<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
           
       }
        
        return low;
    }
}