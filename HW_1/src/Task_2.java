import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        try {
            int age = sc.nextInt();
            System.out.printf("your age is : %d", age);

        } catch (InputMismatchException ex) {
            System.out.println("incorrect enter");
        }
    }
}