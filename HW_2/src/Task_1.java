import java.util.Scanner;

/*
Задача 1:
    Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
    Если число отрицательное или равно нулю,
    программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
    В противном случае, программа должна выводить сообщение "Число корректно".
 */

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        try{
            int number = scanner.nextInt();
            checkNumber(number);
        } catch(ExcepitionHw_2 e){
            System.out.println("Ошибка: " +e.getMessage());
        }
    }
    public static void checkNumber(int value) throws ExcepitionHw_2{
        if (value <= 0){
            throw new ExcepitionHw_2("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }

    }
}
class ExcepitionHw_2 extends Exception{
    public ExcepitionHw_2(String text){
        super(text);
    }
}