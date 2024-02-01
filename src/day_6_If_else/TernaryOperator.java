package day_6_If_else;

public class TernaryOperator {

    public static void main(String[] args) {
        // if else
        int x = 20, y=10;
//        if (x>y) {
//            System.out.println("X больше y " + x);
//        }else {
//            System.out.println(" Y больше чем X " + y);
//        }

        // Тернарный оператор
        String result = x>y ? "X больше y " : "Y больше чем X";
        System.out.println(result);

    }
}
