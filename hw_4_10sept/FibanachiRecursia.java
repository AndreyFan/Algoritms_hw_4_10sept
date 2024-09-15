package de.telran.hw_4_10sept;

import java.sql.Array;
import java.util.Scanner;

public class FibanachiRecursia {
//     1 уровень сложности: 1)
//    Выведите на экран первые 11 членов последовательности Фибоначчи.
//    первый и второй члены последовательности равны единицам
//    а каждый следующий — сумме двух предыдущих
//    Пример последовательности Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите желаемое количество чисел последовательности Фибаначи-  ");
        int n=scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonachi(i) + " ");
        }
    }

    public static int fibonachi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}

