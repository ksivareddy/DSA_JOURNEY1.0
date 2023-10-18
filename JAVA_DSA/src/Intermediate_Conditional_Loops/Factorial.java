package Intermediate_Conditional_Loops;

public class Factorial {
    private static long[] factCache;
    public static void main(String[] args) {
        int n = 21 ;
        factCache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
             System.out.print(factorial(i)+ " ");
        }       
    } 
     private static long factorial(int n) {
        if (n<=1) {
            return 1;
        }
        if(factCache[n] != 0){
            return factCache[n];
        }
       long  nthfact = n * factorial(n-1);
       factCache[n] = nthfact;
        return nthfact;
    }
}
