package lesson23_Encapsulation;

public class test {

    public static void main(String[] args) {
        int a = 0;
        int b = 7;
        System.out.println((a < 1) ? 4 : 5);
        // nested ternary operator
        System.out.println((a < 1) ? (a > b) ? 4 : 5 : 3);

    }
}
