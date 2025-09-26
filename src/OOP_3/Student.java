package OOP_3;

import java.util.ArrayList;

public class Student extends Person{
    public ArrayList<Kurs> kurser = new ArrayList<>();
    public Student(String namn, String adress, int ålder, ArrayList<Kurs> kurser) {
        super(namn, adress, ålder);
        this.kurser = kurser;
    }

    public Student(String namn, String adress, int ålder) {
        super(namn, adress, ålder);
    }

    public void läggTillKurs(Kurs nyKurs){
        if (!kurser.contains(nyKurs)) {
            kurser.add(nyKurs);
            System.out.println("Kurs " + nyKurs.getNamn() + " tillagd till elev " + getNamn());
        } else {
            System.out.println("Elev " + getNamn() + " går redan den här kursen!");
        }
    }

    public void tabortKurs(Kurs kurs){
        if (kurser.contains(kurs)){
            kurser.remove(kurs);
            System.out.println("Tog bort kursen " + kurs + " från elev " + getNamn());
        } else {
            System.out.println("Elev " + getNamn() + " gick inte kursen " + kurs + "!");
        }
    }

    public ArrayList<Kurs> getKurser(){
        return kurser;
    }
}
