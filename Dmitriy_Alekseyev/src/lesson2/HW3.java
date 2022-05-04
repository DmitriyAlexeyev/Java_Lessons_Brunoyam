package lesson2;

import java.util.Scanner;
import java.util.Arrays;

/*
Спросить у пользователя целое положительное число
Создать целочисленный массив такой же длины
С помощью цикла (for или while) заполнить этот массив по правилу:
Каждый элемент равен его индексу, умноженному на 11
После заполнения, вывести массив
Например, если пользователь введет 6, то должен получиться массив [0, 11, 22, 33, 44, 55]
 */
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an integer positive number.");
            int number = sc.nextInt();
            if (number > 0) {
                int[] intArray = new int[number];
                for (int i = 0; i < intArray.length; ++i) {
                    intArray[i] = i * 11;
                }
                System.out.println(Arrays.toString(intArray));
                break;
            } else {
                System.out.println("The number you've entered isn't positive.");
            }
        }
    }
}