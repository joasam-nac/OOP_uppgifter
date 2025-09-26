package OOP_1;

public class Bilregister {
    static void main() {
        Bilägare person1 = new Bilägare("Karl", "Stockholmsvägen 1", 42);
        Bilägare person2 = new Bilägare("Erik", "Götaborgsvägen 2", 35);
        Bilägare person3 = new Bilägare("Lars", "Malmövägen 3", 46);

        Bil bil1 = new Bil("ABC 123", "V70", "Volvo", person1);
        Bil bil2 = new Bil("DEF 456", "Golf", "Volkswagen", person2);
        Bil bil3 = new Bil("GHI 789", "Ceed", "Kia", person3);

        System.out.println(bil1.toString());
        System.out.println(bil2.toString());
        System.out.println(bil3.toString());

        bil1.bytaÄgare(person2);
        bil2.bytaÄgare(person3);
        bil3.bytaÄgare(person1);

        System.out.println(bil1.toString());
        System.out.println(bil2.toString());
        System.out.println(bil3.toString());
    }
}
