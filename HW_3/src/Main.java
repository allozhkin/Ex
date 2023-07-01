
/*
Задача1.
    Напишите программу-калькулятор, которая запрашивает у пользователя два числа и
    выполняет операцию возведения первого числа в степень второго числа.
    Если введены некорректные числа или происходит деление на ноль,
    необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
    Важно! С использованием принципа одного уровня абстракции!
    **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
    выполняющий операцию возведения числа в степень.
    Если введено некорректное основание (ноль) и отрицательная степень,
    выбрасывается исключение InvalidInputException.

    В методе main() мы запрашиваем у пользователя основание и показатель степени,
    вызываем метод calculatePower() и выводим результат.
    Если введены некорректные числа или происходит ошибка ввода,
    соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.

    Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException,
    чтобы явно указать на некорректный ввод.
    Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**


 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int num = getNum("ВВедите основание: ");
            int pow = getNum("Введите тепень");
            System.out.printf("Число %d в степени %d = %d", num, pow, PowerCalculator.calculatePower(num, pow));
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int getNum(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(str);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("error repeat your enter");
                scanner.next();

            }
        }
    }

}
