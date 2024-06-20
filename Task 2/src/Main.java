import java.util.Scanner;

public class Main {
    static int a = 0;

    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        a = inputInt();
        System.out.println(checkParity(a));
    }

    private static boolean checkParity(int a) {
        return a % 2 == 0;
    }

    private static int inputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
