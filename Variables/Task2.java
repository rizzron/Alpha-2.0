import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the slide of the Square");
        int slide = sc.nextInt();
        sc.close();

        int area = slide * slide;
        System.out.println("The area of the Square is " + area);
    }
}
