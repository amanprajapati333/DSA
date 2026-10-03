class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> freq=new HashMap<>();

       int sum=0;
       while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
       }
       return sum;
    }
}