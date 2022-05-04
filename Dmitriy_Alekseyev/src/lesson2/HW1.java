package lesson2;

import java.util.Arrays;

/*
Создать массив дробных чисел double длиной 5 с именем doubles
Вывести массив с помощью Arrays.toString()
Заполнить по очереди все элементы с помощью операции получения элемента по индексу
Вывести массив с помощью Arrays.toString()
Изменить первый элемент на 1.00001, последний элемент на -0.189
Вывести массив с помощью Arrays.toString()
 */
public class HW1 {
    public static void main(String[] args) {
        double[] doubleArray = new double[5];
        System.out.println(Arrays.toString(doubleArray));
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i;
        }
        System.out.println(Arrays.toString(doubleArray));
        doubleArray[0] = 1.00001;
        doubleArray[doubleArray.length - 1] = -0.189;
        System.out.println(Arrays.toString(doubleArray));
    }
}
