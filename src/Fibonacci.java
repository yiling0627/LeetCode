public class Fibonacci {

    public Fibonacci(){

    }

    public int fibo(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public int power(int a, int b){
        if (b == 0) return 1;
        if (b == 1) return a;
        return power(a,b-1) * a;
    }

    public int powerOpt(int a, int b){
        if (b == 0) return 1;
//        if (b == 1) return a;
//        return power(a,b/2) * power(a,(b+1)/2);
        int half = power(a, b/2);
        if (b % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibo(10));
        System.out.println(f.power(2,6));
        System.out.println(f.powerOpt(2,6));
        System.out.println("test");
    }

}
