public class Mutaciones {
    //Complejidad O(N)
    public static int potencial1(int x, int n){
        if(n == 0) return 1;
        return x* potencial1(x, n-1);
    }

    //Complejidad O(lonN)
    public static int potencia2(int x, int n) {
        if (n== 0) return 1;
        if (n % 2== 0) {
            int mitad = potencia2(x, n / 2);
            return mitad * mitad;
        } else {
            return x * potencia2(x, n - 1);
        }
    }

    public static String invertir1(String s) {
        if (s.length() <= 1) return s;
        return invertir1(s.substring(1)) + s.charAt(0);
    }

    public static int contarUnos1(int[] a, int i) {
        if (i == a.length) return 0;
        return (a[i] == 1 ? 1 : 0) + contarUnos1(a, i + 1);
    }

    public static int contarUnos2(int[] a) {
        int count= 0;
        for (int i= 0; i < a.length; i++) {
            if (a[i]== 1) count++;
        }
        return count;
    }
}
