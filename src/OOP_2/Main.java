package OOP_2;

public class Main {
    public static void main(String[] args) {
        Bil bil1 = new Bil(60, 1200, 5);
        Båt båt1 = new Båt(20, 5000, 10000);
        Tåg tåg1 = new Tåg(80, 30000, 5);
        Cykel cykel1 = new Cykel(15, 20, 21);
        cykel1.växla(2);

        skrivUtInfo(bil1);
        skrivUtInfo(båt1);
        skrivUtInfo(tåg1);
        skrivUtInfo(cykel1);
    }

    public static void skrivUtInfo(Printable obj) {
        System.out.println(obj.printMe());
    }
}