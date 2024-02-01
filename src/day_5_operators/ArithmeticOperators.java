package day_5_operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // 2. Африфметические операторы
        // оператор Сложение: +
        int num1, num2, num3;
        num1 = 5; num2 = 10;
        num3 = num1 + num2;
        System.out.println("Результат сложения num1 + num2= " + num3);

        // 2. Африфметические операторы
        // оператор вычитания: -
        int n1, n2, n3;
        n1 = 100; n2 = 50;
        n3 = n1 - n2;
        System.out.println("Результат сложения n1 + n2= " + n3);

        // 2. Африфметические операторы
        // оператор умножения: *
        int a1 = 10;
        int a2 = 5;
        int a3;
        a3 = a1 * a2;
        System.out.println("Результат умножения a1 + a2= " + a3);

        // 2. Африфметические операторы
        // оператор деления: /
        int b1 = 200;
        int b2 = 50;
        int b3;
        b3 = b1 / b2;
        System.out.println("Результат деления b1 + b2= " + b3);

        // 2. Арифметические операторы
        // оператор деление по модулю: %
        int c1 = 20;
        int c2 = 2;
        int c3 = c1 % c2;
        System.out.println("Результат деления c1 + c2= " +c3);

        //3. Унарные операторы
        // унарный оператор минус:-
        double d1 = 10;
        double d2 = -d1;
        System.out.println("Результат унарного оператора = " + d2);

        //3. Унарные операторы
        // унарный оператор плюс:+
        short s1 = 20;
        short s2 = (short) +s1;
        System.out.println("Результат унарного оператора = " + s1);

        //3. Унарные операторы
        // унарный Префиксный оператор инкремент: ++x
        long l1 = 10l;
        ++l1;
        System.out.println("Результат унарного Префиксного оператора инкремент = " + l1);

        //3. Унарные операторы
        // унарный Префиксный оператор декремент: --x
        long l2 = 20;
        --l2;
        System.out.println("Результат унарного Префиксного оператора декремент = " + l2);

        //4. Операторы сравнения
        // Оператор ==
        int i1 = 10;
        int i2 = 5;
        boolean b = i1 == i2;
        System.out.println("Результат опреатора сравнения равно == " + b);

        //4. Операторы сравнения
        // Оператор > больше,чем
        int u1 = 20;
        int u2 = 25;
        boolean bol1 = u1>u2;
        System.out.println("Результат опреатора сравнения больше,чем > " + bol1);

        //4. Операторы сравнения
        // Оператор < меньше,чем
        int k1 = 100;
        int k2 = 200;
        boolean bol2 = k1<k2;
        System.out.println("Результат опреатора сравнения больше,чем < " + bol2);

        //4. Операторы сравнения
        // Оператор <= больше или равно
        int v1 = 505;
        int v2 = 505;
        boolean bol3 = v1 >= v2;
        System.out.println("Результат опреатора сравнения больше или равно <= " + bol3);

        //4. Операторы сравнения
        // Оператор >= меньше или равно
        double dob1 = 30;
        double dob2 = 20;

        boolean bol4 = dob1 <=dob2;
        System.out.println("Результат опреатора сравнения меньше или равно <= " + bol4);

        //4. Операторы сравнения
        // Оператор != не равно
        int int1 = 20;
        int int2 = 20;
        boolean bol5 = int1 !=int2;
        System.out.println("Результат опреатора сравнения не равно != " + bol5);

        //5. Логические операторы
        // оператор && (И)
        boolean bl1 = true;
        boolean bl2 = false;
        boolean bl3 = bl1 && bl2;
        System.out.println("Результат  логического оператора  &&(И) = " + bl3 );

        boolean bo1 = (10>5) && (20>15);
        System.out.println("Результат  логического оператора  &&(И) = " + bo1);

        //5. Логические операторы
        // оператор || (ИЛИ)
        boolean bole1 = false;
        boolean bole2 = false;
        boolean bole3 = true;
        boolean res1 = bole1 || bole2 || bole3;
        System.out.println("Результат  логического оператора  ||(ИЛИ) = " + res1);

        //5. Логические операторы
        // оператор  ! (НЕ)

        boolean bolean1 = false;
        boolean res2 = !bolean1;
        System.out.println("Результат  логического оператора ! (NOT) = " + res2);

        // int a =  x++ / (5*5*2-2+6) - 2/2






































    }
}
