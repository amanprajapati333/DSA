class Solution {
    public int maxDepth(String s) {

        int maxOpen=0;
      
        int maxans=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                maxOpen++;
                maxans=Math.max(maxans,maxOpen);
            }else if (s.charAt(i)==')'){
                maxOpen--;

            }
        }
        return maxans;
        
    }
}