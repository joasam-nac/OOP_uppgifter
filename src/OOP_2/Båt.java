package OOP_2;

public class Båt extends Fordon implements Printable{
    private final int dödvikt;
    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng(String riktning){
        String riktningstext = riktning.toLowerCase();
        if (riktningstext.equals("vänster") || riktningstext.equals("höger")){
            System.out.println("Svänger båten åt " + riktningstext);
        } else {
            System.out.println("Inte giltig riktning för båten!");
        }
    }

    public String printMe(){
        return "Information om båten:\nVikt " + getVikt() + "kg\nHastighet " + getHastighet()*2/(3.6) +
                " knop\nDödvikt " + dödvikt + "kg";
    }
}
