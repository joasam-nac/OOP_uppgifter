package OOP_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lärare extends Person {
    private ArrayList<Kurs> kurser = new ArrayList<>();

    public Lärare(String namn, String adress, int ålder, ArrayList<Kurs> kurser) {
        super(namn, adress, ålder);
        this.kurser = kurser;
    }

    public Lärare(String namn, String adress, int ålder){
        super(namn, adress, ålder);
    }

    public void läggTillKurs(Kurs nyKurs){
        kurser.add(nyKurs);
        System.out.println(getNamn() + " är nu lärare för kursen " + nyKurs.getNamn());
    }
}
