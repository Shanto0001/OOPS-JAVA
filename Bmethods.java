//methods , Packages , Constructur , Acess Modifier 

import java.util.Scanner;

public class Bmethods {
    // Acess modifier - return type - method name (parameter list )
    // static known as a non acess modifer
    static void Myfirstmethod() {
        System.out.println("Hello Shanto");
    }

    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        Bmethods obj = new Bmethods();
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = obj.add(a, b);
        System.out.println(ans);
         
        Myfirstmethod();
    }

}
