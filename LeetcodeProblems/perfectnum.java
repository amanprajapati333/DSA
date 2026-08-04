package LeetcodeProblems;

public class perfectnum {
    public boolean checkPerfectNumber(int num) {

         int divisors=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                divisors+=i;
            }
        }
        return num==divisors;
    }
    public static void main(String[] args) {
        perfectnum obj=new perfectnum();
        int num=28;
        System.out.println(obj.checkPerfectNumber(num));
    }
    
}
