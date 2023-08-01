// Check if a given array is sorted or not.

package Recursion;

public class Problem6 {
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if ( arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 7, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}
