package HederligeHarry.utanInterfaces;

public class BilAnnons extends FordonsAnnons{
    private String sommarDäck, vinterDäck;
    private final String färg;
    public BilAnnons(String rubrik, String beskrivning, double pris, int årsmodell, int antalMil, String sommarDäck, String vinterDäck, String färg) {
        super(rubrik, beskrivning, pris, årsmodell, antalMil);
        this.sommarDäck = sommarDäck;
        this.vinterDäck = vinterDäck;
        this.färg = färg;
    }

    public void ändraSommarDäck(String info){
        sommarDäck = info;
    }

    public void ändraVinterDäck(String info){
        vinterDäck = info;
    }

    public String getSommarDäck(){
        return sommarDäck;
    }

    public String getVinterDäck(){
        return vinterDäck;
    }

    public String getFärg(){
        return färg;
    }

    @Override
    public String getAnnonsText(){
        String annons = "Information om bilen:\n";
        annons += getRubrik() + "\n";
        annons += "kostar: " + getPris() + "kr, ";
        annons += "årsmodell: " + getÅrsmodell() + ", ";
        annons += getAntalMil() + " mil";
        annons += "\nFärg " + färg;
        annons += "\nhar vinterdäck " + vinterDäck + ", har sommardäck " + sommarDäck;
        annons += "\n" + getBeskrivning();
        return annons;
    }
}
