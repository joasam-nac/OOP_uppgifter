package HederligeHarry.medInterfaces;

public class BilAnnons extends FordonsAnnons implements Publishable, Revenuable{
    public BilAnnons(int pris, int årsmodell, String rubrik, String beskrivning, int antalMil) {
        super(pris, årsmodell, rubrik, beskrivning, antalMil);
    }

    @Override
    public String PrintHeader() {
        return getRubrik() + ", " + getPris();
    }

    @Override
    public String PrintCompleteAd() {
        String annons = "Information om bilen:\n";
        annons += getRubrik() + "\n";
        annons += "kostar: " + getPris() + "kr, ";
        annons += "årsmodell: " + getÅrsmodell() + ", ";
        annons += getAntalMil() + " mil";
        annons += "\n" + getBeskrivning();
        return annons;
    }

    @Override
    public double calculateRevenue() {
        return getPris()*(1-0.25);
    }
}
