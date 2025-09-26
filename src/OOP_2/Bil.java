package OOP_2;

public class Bil extends Fordon implements Printable, Hjulburen {
    private final int antalVäxlar;
    private int växelJustNu = 0;
    private final int antalHjul = 4;
    public Bil(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
    }

    public void växla(int nyVäxel){
        if (nyVäxel > växelJustNu){
            while (växelJustNu < nyVäxel){
                växelJustNu++;
                if (växelJustNu != nyVäxel) {
                    System.out.println("Ökar växeln till: " + växelJustNu);
                }
            }
        } else if (nyVäxel < växelJustNu){
            while (växelJustNu > nyVäxel){
                växelJustNu--;
                if (växelJustNu != nyVäxel) {
                    System.out.println("Minskar växeln till: " + växelJustNu);
                }
            }
        } else {
            System.out.println("Behövde inte växla");
        }
        System.out.println("Är nu på växel: " + växelJustNu + " och har växlat klart");
    }

    public int getAntalVäxlar(){
        return antalVäxlar;
    }

    public int getVäxelJustNu(){
        return växelJustNu;
    }

    public String printMe(){
        return "Information om bilen:\nVikt " + getVikt() + "kg\nHastighet " + getHastighet() +
        "km/h\nAntal växlar " + antalVäxlar + "st\nVäxel som är i " + växelJustNu +
                "\nAntal hjul " + getAntalHjul();
    }

    public int getAntalHjul(){
        return antalHjul;
    }

}
