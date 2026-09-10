class Solution {
    public int countSubstrings(String s) {
        int count=0;
       
        for(int i=0;i<s.length();i++){
            String sub="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                sub=sub+ch;
                if(palindrone(sub)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean palindrone(String str){
        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }


            start++;
            end--;

        }
        return true;
    }
}