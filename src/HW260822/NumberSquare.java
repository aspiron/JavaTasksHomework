package HW260822;

//Найти a², не используя оператор *  (а – целое > 0)

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("Квадрат заданного числа равен: " + Math.pow(a, 2));
        } else {
            System.out.println("Заданное число не соответствует условиям задачи");
        }

    }
}
