package day_6_If_else;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третое число");
        int c = scanner.nextInt();

        if (a>=b && a>=c){
            System.out.println("Самое большое число а=" + a);
        } else if (b>=a && b>=c) {
            System.out.println("Самое большое число b=" + b);
        }else {
            System.out.println("Самое большое число c=" + c);
        }
    }

}
