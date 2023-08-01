package Recursion;

public class Problem9 {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int xon = x * pow(x, n-1);
        return xon;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
