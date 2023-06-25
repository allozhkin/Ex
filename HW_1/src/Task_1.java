import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите чило - ");
        int a = sc.nextInt();
        System.out.println("ВВедите чило - ");
        int a2 = sc.nextInt();
        System.out.println(divide(a, a2));
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("devide by zero not permited");
        }
        return a1 / a2;
    }

}