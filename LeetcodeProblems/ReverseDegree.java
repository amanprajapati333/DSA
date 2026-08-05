package LeetcodeProblems;

public class ReverseDegree {

    public static int reverseDegree(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=('z'-s.charAt(i)+1)*(i+1);
        }

        return sum;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(reverseDegree(s));

    }
    
}
