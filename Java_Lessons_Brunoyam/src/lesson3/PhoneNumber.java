package lesson3;

public class PhoneNumber {

    int num;
    String numType;

    public PhoneNumber() {
    }

    public PhoneNumber(int num, String numType) {
        this.num = num;
        this.numType = numType;
    }

    public String toString() {
        return "Телефон: " + num + " " + numType;
    }
}
