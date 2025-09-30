package HederligeHarry.utanInterfaces;

public class HusvagnsAnnons extends FordonsAnnons{
    private String harDusch;
    private int antalSängar;
    public HusvagnsAnnons(String rubrik, String beskrivning, double pris, int årsmodell, int antalMil, String harDusch, int antalSängar) {
        super(rubrik, beskrivning, pris, årsmodell, antalMil);
        this.harDusch = harDusch;
        this.antalSängar = antalSängar;
    }

    public String getHarDusch(){
        return harDusch;
    }

    public int getAntalSängar(){
        return antalSängar;
    }


}
