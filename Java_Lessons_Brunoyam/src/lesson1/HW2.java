package lesson1;

import java.util.Scanner;

/*
Спросить у пользователя целое число с помощью Scanner
В случае, если пользователь ввел число больше 1000000, вывести "Большое число"
В обратном случае, вывести "Небольшое число"
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        System.out.println((sc.nextInt() > 1000000) ? "Big number" : "Small number");
    }
}
