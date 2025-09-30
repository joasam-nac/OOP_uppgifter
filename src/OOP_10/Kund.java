package OOP_10;

import java.util.ArrayList;
import java.util.List;

public class Kund extends Person {
    private List<Konto> konton;
    private List<Lån> lån;

    public Kund(String namn, String adress, String personnummer, int ålder) {
        super(namn, adress, personnummer, ålder);
        this.konton = new ArrayList<>();
        this.lån = new ArrayList<>();
    }

    public void läggTillKonto(Konto nyttKonto) {
        if (!konton.contains(nyttKonto)) {
            konton.add(nyttKonto);
        } else {
            System.out.println("Kunden har redan detta konto!");
        }
    }

    public void taBortKonto(Konto konto) {
        if (konton.contains(konto)) {
            konton.remove(konto);
        } else {
            System.out.println("Kunden hade inte kontot!");
        }
    }

    public List<Konto> getKonton() {
        return konton;
    }

    public void läggTillLån(Lån nyttLån) {
        if (!lån.contains(nyttLån)) {
            lån.add(nyttLån);
        } else {
            System.out.println("Kunden har redan detta lån!");
        }
    }

    public void taBortLån(Lån lånAttTaBort) {
        if (lån.contains(lånAttTaBort)) {
            lån.remove(lånAttTaBort);
        } else {
            System.out.println("Kunden hade inte lånet!");
        }
    }

    public List<Lån> getLån() {
        return lån;
    }

    @Override
    public String toString() {
        return "Kund: " + getNamn() +
                ", Personnummer: " + getPersonnummer() +
                ", Ålder: " + getÅlder() +
                ", Adress: " + getAdress() +
                ", Antal konton: " + konton.size() +
                ", Antal lån: " + lån.size();
    }
}