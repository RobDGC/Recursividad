public class Fibonacci {

    public int fibRecursivo(int n) {
        if (n <= 1) return n;

        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

}
