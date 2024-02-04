import java.util.Scanner;

public class newwww {


    // 1st fustion
    public static void printmyname() {
        System.out.println("SHANTO THOMAS");
    }

    // 2nd funstion
    public static void inputmyname(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        printmyname();
        Scanner cc = new Scanner(System.in);
        String name = cc.next();

        inputmyname(name);

    }

}
