import java.util.Scanner;

public class Task01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        sc.close();

        if(num >= 0)
        {
            System.out.println("The number is a positive number");    
        } else
            System.out.println("The number is a negative number");
    }
}