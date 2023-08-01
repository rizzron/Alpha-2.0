import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the price of a Pencil");
        float pencilPrice = sc.nextFloat();
        System.out.println("Please enter the price of a Pen");
        float penPrice = sc.nextFloat();
        System.out.println("Please enter the price of a Eraser");
        float eraserPrice = sc.nextFloat();
        sc.close();

        float sum$ = penPrice + pencilPrice + eraserPrice;

        System.out.println("Pencil price: " + pencilPrice);
        System.out.println("Pen price: " + penPrice);
        System.out.println("Erase price: " + eraserPrice);
        System.out.println("------------------------");
        System.out.println("Total price: " + sum$);
    }
}
