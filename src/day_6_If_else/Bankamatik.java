package day_6_If_else;

import java.util.Scanner;

public class Bankamatik {

    public static void main(String[] args) {
        // Человек хочет снять или внести деньги на свой счет
        // String name = "oleg"; String pass = "12345";
        // if (name.equals("name") && password.equals("pass")){
        //
        // double balans = 1000.00;
        // balans += amount; balans = balans + amount; внесение денег на баланс
        // balans -= amount; balans = balans - amount; снятие денег с баланса
        // String name; String password;
        //

        double balance = 1000;
        final String name = "beck", password = "beck";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш банк");
        System.out.println("==================================");
        System.out.println("Пжл введите ваше имя: ");
        String yourName = scanner.nextLine();
        System.out.println("Пжл введите ваш пароль: ");
        String yourPassword = scanner.nextLine();

        if (yourName.equalsIgnoreCase(name) && yourPassword.equalsIgnoreCase(yourPassword)){
            System.out.println("Вы прошли аутентикацию");
            System.out.println("==================================");
            System.out.println("Ваш баланс= " + balance);
            System.out.println("==================================");
            System.out.println("Выберите необходимую операцию.\nДля внесения денег нажмите #1#.\nДля снятия нажмите #2#");
            int operation = scanner.nextInt();
            switch (operation){
                case 1:{
                    System.out.println("Введите сумму пополнение");
                    double amount = scanner.nextDouble();
                    balance = balance + amount;
                    System.out.println("Вы успешно пополнили баланс на=" + amount+" ваш новый баланс=" + balance);
                    break;
                    }
                case 2:{
                    System.out.println("Введите сумму снятия");
                    double amount = scanner.nextDouble();
                    if (amount>balance){
                        System.out.println("Сумма снятия денег=" + amount + " превышает ваш баланс=" + balance);
                    }else {
                        balance = balance - amount;
                        System.out.println("Вы успешно сняли денег на сумму =" + amount + " ваш новый баланс=" + balance);
                    }
                    break;

                }
                default:
                    System.out.println("Неправильное название операции");
            }
        }else {
            System.out.println("Вы неправильно ввели имя или пароль");
        }


    }
}
