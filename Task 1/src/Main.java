import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        if (b == 0){
            System.out.println("Division by zero");
        } else {
            double divide = (a / b);
            System.out.println(divide);
        }

    }

    private static void diff() {
        //todo дописать логику и печать результата
        double diff = a - b;
        System.out.println(diff);
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        double multiply = a * b;
        System.out.println(multiply);
    }

    private static void sum() {
        //todo дописать логику и печать результата
        double sum = a + b;
        System.out.println(sum);
    }

    private static double inputDouble() {
        //todo дописать логику
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }
}
