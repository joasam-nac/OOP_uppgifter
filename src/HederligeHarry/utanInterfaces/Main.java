package HederligeHarry.utanInterfaces;

public class Main {
    public void main(){
        BilAnnons bil1 = new BilAnnons("Saab 98", "Har sått i garaget länge", 15000.0, 1998, 13000, "J", "J", "silver");
        HusvagnsAnnons hv1 = new HusvagnsAnnons("Wünderhaus", "Liten med rymlig", 67000, 2007, 120000, "N", 3);
        MotorcykelsAnnons mc1 = new MotorcykelsAnnons("Yamaha H-71", "Snabb och snåldriven", 9078, 2015, 3000, 800, "kardan");

        System.out.println(bil1.getAnnonsText());
        System.out.println(hv1.getAnnonsText());
        System.out.println(mc1.getAnnonsText());
    }
}
