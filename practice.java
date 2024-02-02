import java.util.Scanner;

public class practice {
    /**
     * Innerpractice
     */
    public static class Innerpractice {

        int A;
        int B;
        int c = A + B;

    }
    


    public static void main(String[] args) {
        Innerpractice one = new Innerpractice();
        one.A = 10;
        one.B = 90;
        one.c = one.A + one.B;

        System.out.println(one.c);
    }
}
