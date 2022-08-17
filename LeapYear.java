package academy.learnprogramming;

public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(2000);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        } else {
            return false;
        }
    }
}
