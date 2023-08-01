// 

package Recursion;

public class Problem11 {
    public static int tillingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // for vartical choices
        int fnm1 = tillingProblem(n-1);
        // for horizontal choices
        int fnm2 = tillingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tillingProblem(n));
    }
}
