package lesson3;

/*
�������� ����� � ������ repeatString, ������� ��������� ������ s � ����� ����� num ��� ���������
� ������� ������ s �� ����� num ���
��������, ���� ������� repeatString("asd", 3), �� � ������� ������ ��������� ������ "asd"
 */

public class HW2 {
    static void repeatString(String s, int num) {
        int i;
        for (i = 0; i < num; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        repeatString("asd", 3);

    }
}
