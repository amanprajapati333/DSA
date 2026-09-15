
class Solution {

    public int maxPalindromes(String s, int k) {

        int n = s.length();
        int ans = 0;
        int start = 0;

        for(int r=k-1;r<n;r++){
            for(int len=k;len<=r-start+1;len++){
                int l=r-len+1;
                if(isPalindrome(s,l,r)){
                    ans++;
                    start=r+1;
                    break;
                     
                }
            }
        }
        return ans;

    }
    private boolean isPalindrome(String s, int low, int high) {

        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
}