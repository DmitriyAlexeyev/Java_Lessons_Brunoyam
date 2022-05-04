package lesson2;

import java.util.Scanner;
import java.util.Arrays;

/*
Спросить у пользователя целое положительное число m
Создать целочисленный массив длины m
С помощью цикла (for или while) заполнить этот массив из ввода пользователя,
т.е. спросить у пользователя целое число m раз и записать эти числа по очереди в массив
Вывести массив с помощью Arrays.toString()
Задание со "звёздочкой":
рассчитать сумму элементов в массиве и вывести её
 */
public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the array:");
            int number = sc.nextInt();
            if (number > 0) {
                int[] intArray = new int[number];
                int i;
                int sum = 0;
                for (i = 0; i < intArray.length; i++) {
                    System.out.println("Enter the number " + (i + 1) + ":");
                    intArray[i] = sc.nextInt();
                    sum = sum + intArray[i];
                }
                System.out.println(Arrays.toString(intArray));
                System.out.println("The sum of the array numbers equals: " + sum);
                break;
            } else {
                System.out.println("Array length must be a positive number.");
            }
        }
    }
}
