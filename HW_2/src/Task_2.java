/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
    Если второе число равно нулю,
    программа должна выбрасывать исключение DivisionByZeroException
    с сообщением "Деление на ноль недопустимо".
    В противном случае, программа должна выводить результат деления.
 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            checkDivision(a, b);
        } catch (ExceptionDivision e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkDivision(int a, int b) throws ExceptionDivision {
        int sum = 0;
        if (b == 0) {
            throw new ExceptionDivision("Деление на ноль недопустимо");
        } else {
            sum = a / b;
            System.out.println(a + "/" + b + "=" + sum);
        }
    }
}

class ExceptionDivision extends Exception {
    public ExceptionDivision(String str) {
        super(str);
    }
}