package Recursion;

public class Problem10 {
    public static int optmizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        // If n is EVEN
        int halfPowwerSq = optmizedPow(x, n/2) * optmizedPow(x, n/2);
        // If the n is ODD
        if(n % 2 != 0){
            halfPowwerSq = x * halfPowwerSq;
        }
        return halfPowwerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optmizedPow(x, n));
    }
}
