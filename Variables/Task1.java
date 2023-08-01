import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter First number");
        int num1 = sc.nextInt();
        System.out.println("Please enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Please enter Third number");
        int num3 = sc.nextInt();
        sc.close();

        int sum = num1 + num2 + num3;
        int avg = sum/3;

        System.out.println("\nThe average is " + avg);

    }
}