class Solution {
    public String removeOuterParentheses(String s) {

        String result="";
        int len=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                 if(len>0){
                result+=ch;
                 }
            len++;
        }
            else{
                len--;
                if(len>0){
                    result+=ch;
                }
            }
        }
return result;
    }
}