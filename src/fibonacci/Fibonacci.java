public class Fibonacci {
    int n;
    public enum Method {
        RECURSIVE,
        ITERATIVE,
        DP //dynamic programming
    }
    public Fibonacci(int n, Method m){
        this.n = n;
        this.m = m; //this.m = Objects.requireNonNull(m, "received null " + "method");
    }
}