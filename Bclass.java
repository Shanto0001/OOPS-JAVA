/**
 * Bclass
 */
public class Bclass {

    public static class student { // write static // This is a class
        String name;
        String classNo;
        int rollno;
        float percentage;
    }

    public static void main(String[] args) {
        student Shanto = new student(); // from class we make the 1st student name //
        // giving detail about student

        Shanto.name = "SHANTO THOMAS";
        Shanto.classNo = "606-A";
        Shanto.rollno = 1434;
        Shanto.percentage = 98;

        System.out.println(
                Shanto.name + (" ") + Shanto.classNo + (" ") + Shanto.rollno + (" ") + Shanto.percentage + (" "));

        student Shyam = new student();
        Shyam.name = "Shyam Kaushik";
        Shyam.classNo = "606-A";
        Shyam.rollno = 1406;
        Shyam.percentage = 98;
        System.out.println(
                Shyam.name + (" ") + Shyam.classNo + (" ") + Shyam.rollno + (" ") + Shyam.percentage + (" "));

    }
}