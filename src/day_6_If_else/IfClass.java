package day_6_If_else;

public class IfClass {

    public static void main(String[] args) {
        // простой IF

        if (true){
            System.out.println("TRUE");
        }

        // If else
        int x = 10;
        int b = 20;
        if (x>b) {
            System.out.println(" X больше чем b");
        }else {
            System.out.println(" X меньше b");
        }

        //if, else if
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        if (num1<=num2 && num1<=num3){
            System.out.println(" Num1 ровно =" + num1);
        }else if (num2<=num1 && num2<=num3){
            System.out.println("num2 ровоно=" + num2);
        }else{
            System.out.println("num3 роовно = " + num3);
        }



    }
}
