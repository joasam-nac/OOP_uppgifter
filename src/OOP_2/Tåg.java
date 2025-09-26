package OOP_2;

public class Tåg extends Fordon implements Printable{
    int antalVagnar;
    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn(){
        antalVagnar++;
        System.out.println("Tåget har nu " + antalVagnar + " kopplade");
    }

    public String printMe(){
        return "Information om tåget:\nVikt " + getVikt() + "kg\nHastighet " + getHastighet() +
                "km/h\nAntal vagnar " + antalVagnar + "st";
    }
}
