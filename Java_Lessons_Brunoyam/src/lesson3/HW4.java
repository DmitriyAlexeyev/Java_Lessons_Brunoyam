package lesson3;

/*
�������� � ����� PhoneNumber ��� ������������:
������ - ��� ����������, �� ������ �������� numType = ""
������ - � ����� ����������� ����� �� �����, ��� � ����, �� �������� �������� ���������� � ����
� psvm ������� ��� ������� ������ PhoneNumber
    ������ - � ������� ������������ ��� ���������� � ����� ������ �������� ��� �����
    ������ - � ������� ������������ � ����� �����������
������� ���������� �� ����� �������� �� ������ �� ������
 */
public class HW4 {
    public static void main(String[] args) {
        PhoneNumber b = new PhoneNumber();
        b.num = 891112345;
        b.numType = "�������";
        PhoneNumber c = new PhoneNumber(991154321, "������");
        System.out.println(b.toString() + "\n" + c.toString());

    }
}
