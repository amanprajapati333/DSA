public class demo1 {

    public static  void f(int n){
        if(n==0){
            return;
        }
        f(n-1);
        System.out.print(n);
        f(n-1);

    }

    public static void f1(int n){
        if(n==0) return;
        System.out.println(n);
        f1(n/2);
        
    }
    public static void puzzle(int n){
    if (n == 0) return;
    puzzle(n-1);
    puzzle(n-1);
    System.out.print(n);
    }
    public static int recur(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return recur(n-1)+n;
        }else{
            return recur(n-1);
        }
    }



    public static void main(String[] args) {
        f(2);
        System.out.println(" ");
        f1(8);
        System.out.println(" ");
        puzzle(3);
        System.out.println(" ");
        System.out.println(recur(6));

    }
    
}
