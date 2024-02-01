package day_5_operators;

public class Operator {

    public static void main(String[] args) {

        // Что такое оператор и операнды
        // 1. Assignment operator// Оператор присваивания
        int num1,num2,num3;
        num1 = 10;
        num2 =  15;
        // num1, num2 --> операнд
        // + --> оператор
        num3 = num1 + num2;
        System.out.println("Результат сложение =" + num3);


        int x = 1;

        boolean a,b;
        a = b = true;

        // оператор +=
        int num4, num5;
        num4 = 10;
        num5 = 5;
        num4 += num5; // num4 = num4 + num5
        System.out.println(num4);

        // оператор -=
        num4 -= num5; // num4 = num4 - num5;
        System.out.println(num4);

        // оператор *=
        int n1, n2;
        n1 = 20; n2 = 10;
        n1 *=n2; // n1 = n1 * n2;
        System.out.println(n1);

        // оператор /=
        int n3,n4;
        n3 = 10; n4 = 5;
        n3 /= n4; //n3 = n3 / n4;
        System.out.println(n3);













    }
}
