package HederligeHarry.medInterfaces;

public class FordonsAnnons {
    private String rubrik;
    private double pris, beskrivning;
    private int årsmodell, antalMil;

    public String getAnnonsText(){
        String annons = "Information om annonsen:\n";
        annons += rubrik + "\n";
        annons += "kostar: " + pris + "kr, ";
        annons += "årsmodell: " + årsmodell + ", ";
        annons += antalMil + " mil";
        annons += "\n" + beskrivning;
        return annons;
    }


}
