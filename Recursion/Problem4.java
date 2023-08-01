package Recursion;

// Print Sum of First n Natural Numbers.

public class Problem4 {

    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + (n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));
    }
}
