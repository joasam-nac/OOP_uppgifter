package OOP_10;

import java.util.ArrayList;
import java.util.List;

public class BankGenerator {
    private final String bankNamn;
    private final List<Kund> kunder;
    private final List<Personal> personalLista;

    public BankGenerator(String namn) {
        this.bankNamn = namn;
        this.kunder = new ArrayList<>();
        this.personalLista = new ArrayList<>();
    }

    public void läggTillKund(Kund nyKund) {
        if (!kunder.contains(nyKund)) {
            kunder.add(nyKund);
        } else {
            System.out.println("Kunden finns redan i banken!");
        }
    }

    public void taBortKund(Kund kund) {
        if (kunder.contains(kund)) {
            kunder.remove(kund);
        } else {
            System.out.println("Kunden finns inte i banken!");
        }
    }

    public List<Kund> getKunder() {
        return kunder;
    }

    public Kund hittaKundMedPersonnummer(String personnummer) {
        for (Kund k : kunder) {
            if (k.getPersonnummer().equals(personnummer)) {
                return k;
            }
        }
        return null;
    }

    public void skrivUtAllaKunder() {
        System.out.println("Kunder hos " + bankNamn + ":");
        for (Kund k : kunder) {
            System.out.println(k.toString());
        }
    }

    public void läggTillPersonal(Personal nyPersonal) {
        if (!personalLista.contains(nyPersonal)) {
            personalLista.add(nyPersonal);
        } else {
            System.out.println("Personalen finns redan i banken!");
        }
    }

    public void taBortPersonal(Personal personal) {
        if (personalLista.contains(personal)) {
            personalLista.remove(personal);
        } else {
            System.out.println("Personalen finns inte i banken!");
        }
    }

    public List<Personal> getPersonalLista() {
        return personalLista;
    }

    public void skrivUtAllPersonal() {
        System.out.println("Personal hos " + bankNamn + ":");
        for (Personal p : personalLista) {
            System.out.println(
                    p.getNamn() + ", Befattning: " +
                            p.getBefattning() + ", Lön: " + p.getLön()
            );
        }
    }

    public String getBankNamn() {
        return bankNamn;
    }

    @Override
    public String toString() {
        return "Bank: " + bankNamn + ", Antal kunder: " + kunder.size() +
                ", Antal personal: " + personalLista.size();
    }
}