package OOP_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Joakim", "Stockholmsvägen 123", 24);
        Student s2 = new Student("Mikaoj", "Göteborgsvägen 456", 42);
        Lärare l1 = new Lärare("Jan", "Malmövägen 789", 74);
        Kurs k1 = new Kurs("Objektorientering och Java", l1);
        ArrayList<Student> klassJava25 = new ArrayList<Student>(Arrays.asList(s2,s1));
        k1.läggTillFleraStudenter(klassJava25);

        System.out.println(k1.to_String());
        System.out.println("----------------------------");
        System.out.println(k1.allaEleversKureserToString());
    }
}
