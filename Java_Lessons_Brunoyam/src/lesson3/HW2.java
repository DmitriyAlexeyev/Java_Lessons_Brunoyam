package lesson3;

/*
Ќаписать метод с именем repeatString, который принимает строку s и целое число num как аргументы
и выводит строку s на экран num раз
Ќапример, если вызвать repeatString("asd", 3), то в консоль трижды выведетс€ строка "asd"
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
