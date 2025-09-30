package OOP_10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankGenerator bank = new BankGenerator("Joakims Enskilda Bank");

        Personal anna = new Personal("Anna Persson", "Stockholm",
                "850101-1234", 40, 35000, "Rådgivare");
        Personal johan = new Personal("Johan Larsson", "Göteborg",
                "900505-5678", 33, 42000, "Chef");
        Personal sara = new Personal("Sara Ek", "Uppsala",
                "920202-4321", 31, 30000, "Handläggare");
        Personal peter = new Personal("Peter Nilsson", "Malmö",
                "750909-8765", 50, 55000, "Filialchef");

        bank.läggTillPersonal(anna);
        bank.läggTillPersonal(johan);
        bank.läggTillPersonal(sara);
        bank.läggTillPersonal(peter);

        Kund lisa = new Kund("Lisa Andersson", "Malmögatan 23",
                "010101-1111", 22);
        Konto lisaKonto = new Konto(0.03, anna);
        lisaKonto.ökaSaldo(2000);
        lisa.läggTillKonto(lisaKonto);

        Lån lisaLån = new Lån(8000, 0.06, johan);
        lisa.läggTillLån(lisaLån);

        bank.läggTillKund(lisa);

        Kund erik = new Kund("Erik Svensson", "Göteborgsvägen 65",
                "990303-2222", 24);
        Konto erikKonto1 = new Konto(0.02, sara);
        erikKonto1.ökaSaldo(1500);
        erik.läggTillKonto(erikKonto1);

        Konto erikKonto2 = new Konto(0.04, peter);
        erikKonto2.ökaSaldo(5000);
        erik.läggTillKonto(erikKonto2);

        bank.läggTillKund(erik);

        Kund maria = new Kund("Maria Nilsson", "Stockholmsvägen 76",
                "880808-3333", 37);
        Konto mariaKonto = new Konto(0.05, anna);
        mariaKonto.ökaSaldo(10000);
        maria.läggTillKonto(mariaKonto);

        Lån mariaLån1 = new Lån(50000, 0.045, peter);
        maria.läggTillLån(mariaLån1);

        Lån mariaLån2 = new Lån(150000, 0.052, johan);
        maria.läggTillLån(mariaLån2);

        bank.läggTillKund(maria);

        System.out.println(bank.toString());

        System.out.println("\n--- Alla kunder ---");
        bank.skrivUtAllaKunder();

        System.out.println("\n--- All personal ---");
        bank.skrivUtAllPersonal();

        System.out.println("\n--- Kontohistorik för Maria ---");
        for (Konto k : maria.getKonton()) {
            System.out.println(k.Historik());
        }

        System.out.println("\n--- Lånhistorik för Maria ---");
        for (Lån l : maria.getLån()) {
            System.out.println(l.Historik());
        }

        lisaKonto.ränteTillväxt();
        System.out.println("\nLisa efter ränta på kontot: " + lisaKonto.getSaldo() + " kr");

        lisaLån.amortera(2000);
        System.out.println("Lisa efter amortering: skuld " + lisaLån.getLåneBelopp() + " kr");

        mariaLån1.amortera(10000);
        mariaKonto.ränteTillväxt();
        System.out.println("\nMaria efter amortering och ränta:");
        System.out.println("Saldo på konto: " + mariaKonto.getSaldo() + " kr");
        System.out.println("Låneskuld kvar: " + mariaLån1.getLåneBelopp() + " kr");

        sara.ökaLön(5);
        peter.ökaLön(3);
        System.out.println("\nEfter löneökning:");
        bank.skrivUtAllPersonal();
    }
}