package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HW0 {

    static void task3() {
        /*
        HW0
        Создать метод, принимающий массив целых чисел ints и целое число target
        и возвращает индекс элемента, равного target, внутри ints
         */
    }

    public static int targetFromArray(int[] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            if (target == ints[i]) return i;
        }
        return -1;
    }


    public static void main(String[] args) {

//        int target = 5;
//        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(targetFromArray(ints, target));

        /*
        HW0
        Спросить у пользователя строку с помощью nextLine()
        В полученной строке заменить все слова "телефон" на "phone"
        и убрать лишние пробелы
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        System.out.println(sc.nextLine().replaceAll(" ", "").replace("телефон", "phone "));


    }


}