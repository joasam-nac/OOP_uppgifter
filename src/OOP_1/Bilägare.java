package OOP_1;

public class Bilägare extends Person {
    public Bilägare(String n, String a, int å) {
        super(n, a, å);
    }

    @Override
    public String toString() {
        return getNamn() + ", " + getÅlder() + ", " + getAdress();
    }
}
