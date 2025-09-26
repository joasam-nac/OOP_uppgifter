package OOP_3;

import java.util.ArrayList;

public class Kurs {
    private String namn;
    private Lärare lärare;
    private ArrayList<Student> studenter = new ArrayList<>();

    public Kurs(String namn, Lärare lärare, ArrayList<Student> studenter){
        this.namn = namn;
        this.lärare = lärare;
        this.studenter = studenter;
    }

    public Kurs(String namn, Lärare lärare){
        this.namn = namn;
        this.lärare = lärare;
    }

    public String getNamn(){
        return namn;
    }

    public void läggTillStudent(Student nyElev){
        if(studenter.contains(nyElev)){
            System.out.println(nyElev.getNamn() + " går redan kursen " + namn);
        } else {
            studenter.add(nyElev);
            nyElev.läggTillKurs(this);
            System.out.println("Student " + nyElev.getNamn() + " är tillagd i kursen " + namn);
        }
    }

    public void läggTillFleraStudenter(ArrayList<Student> ElevLista){
        for (Student e : ElevLista){
            läggTillStudent(e);
        }
    }

    public void bytLärare(Lärare nyLärare){
        System.out.println(lärare.getNamn() + " slutar lära ut kursen " + namn);
        lärare = nyLärare;
        System.out.println(lärare.getNamn() + " är nu lärare för kursen " + namn);
    }

    public String to_String(){
        StringBuilder utmatning = new StringBuilder("Kursnamn: " + namn + "\nLärare: " + lärare.getNamn() + "\nElevlista:");
        for (Student s: studenter) {
            utmatning.append("\n").append(s.getNamn());
        }
        return utmatning.toString();
    }

    public String allaEleversKureserToString(){
        String utmatning = "Lista över alla studenters kurser som går denna kurs:";
        for (Student s: studenter){
            utmatning += "\n" + s.getNamn() + " går dessa kurser:";
            for (Kurs k: s.getKurser()){
                utmatning += "\n\t* " + k.getNamn();
            }
        }
        return utmatning;
    }
}
