/*
Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100,
выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
Если второе число меньше 0,
выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10,
выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
Если третье число равно 0,
выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа по очереди: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            CheckTask3(a, b, c);
        } catch (ExceptionTask3 e){
            System.out.println("error : " + e.getMessage());
        }

    }

    public static void CheckTask3(int a, int b, int c) throws ExceptionTask3 {
        if (a > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if ((a + b) < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }

    }
}

class ExceptionTask3 extends Exception {
    public ExceptionTask3(String msg) {
        super(msg);
    }

}

class NumberOutOfRangeException extends ExceptionTask3 {
    public NumberOutOfRangeException(String msg) {
        super(msg);
    }
}

class NumberSumException extends ExceptionTask3 {
    public NumberSumException(String msg) {
        super(msg);
    }
}

class DivisionByZeroException extends ExceptionTask3 {
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}
