public class Factorial {

    public int factorialRecursivo(int n){
        if(n<= 1) return 1;

        return n*factorialRecursivo(n-1);
    }

    public int factorialIterativo(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public int factorialAcumulativo(int n, int acumulador){
        if(n<=1) return acumulador;
        return factorialAcumulativo(n-1, acumulador*n);
    }

}

