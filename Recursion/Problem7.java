// First occurrence of element in an array

package Recursion;

public class Problem7 {
    public static int firstOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(firstOccurrence(arr, 11, 0));

    }
}
