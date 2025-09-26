package OOP_2;

public class Cykel extends Bil implements Printable {
    private final int antalHjul = 2;
    public Cykel(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt, antalVäxlar);
    }

    @Override
    public String printMe(){
        return "Information om cykeln:\nVikt " + getVikt() + "kg\nHastighet " + getHastighet() +
                "km/h\nAntal växlar " + getAntalVäxlar() + "st\nVäxel just nu " + getVäxelJustNu() +
                "\nAntal hjul " + getAntalHjul();
    }

    @Override
    public int getAntalHjul(){
        return antalHjul;
    }

}
