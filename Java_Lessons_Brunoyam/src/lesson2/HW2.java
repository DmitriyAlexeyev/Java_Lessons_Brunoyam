package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя одно целое число типа int
С помощью цикла while вывести столько же раз фразу "Цикл while"
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int intNum = sc.nextInt();
        if (intNum < 0) {
            intNum = Math.abs(intNum);
        }
        while (intNum > 0) {
            System.out.println("Cycle while");
            --intNum;
        }
    }
}
