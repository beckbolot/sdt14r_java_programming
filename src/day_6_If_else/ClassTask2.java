package day_6_If_else;

import java.util.Scanner;

public class ClassTask2 {

    public static void main(String[] args) {
        int minAge = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скажите ваш возраст");
        int age = scanner.nextInt();

        String message = age >= minAge ? "Разрещена продажа": "Вам не разрешена в продаже";
        System.out.println(message);

    }
}
