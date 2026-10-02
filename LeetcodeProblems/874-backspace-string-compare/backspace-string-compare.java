class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();   
         Stack<Character> stack2=new Stack<>();  

        for(char num:s.toCharArray()){
            if(num!='#'){
                stack1.push(num);
            }else if(!stack1.isEmpty()){
                stack1.pop();
                
            }
        }     
         for(char num2:t.toCharArray()){
            if(num2!='#'){
                stack2.push(num2);
            }else if(!stack2.isEmpty()){
                stack2.pop();
            }
        }  
        return stack1.equals(stack2);   
    }
}