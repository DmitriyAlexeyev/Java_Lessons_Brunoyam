package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HW0 {

    static void task3() {
        /*
        HW0
        ������� �����, ����������� ������ ����� ����� ints � ����� ����� target
        � ���������� ������ ��������, ������� target, ������ ints
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
        �������� � ������������ ������ � ������� nextLine()
        � ���������� ������ �������� ��� ����� "�������" �� "phone"
        � ������ ������ �������
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� ��������");
        System.out.println(sc.nextLine().replaceAll(" ", "").replace("�������", "phone "));


    }


}