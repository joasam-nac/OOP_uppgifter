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

    @Override
    public String getAnnonsText(){
        String annons = "Information om husvagnen:\n";
        annons += getRubrik() + "\n";
        annons += "kostar: " + getPris() + "kr, ";
        annons += "årsmodell: " + getÅrsmodell() + ", ";
        annons += getAntalMil() + " mil";
        annons += " Har dusch " + harDusch + ", antal sängar: " + antalSängar;
        annons += "\n" + getBeskrivning();
        return annons;
    }
}
