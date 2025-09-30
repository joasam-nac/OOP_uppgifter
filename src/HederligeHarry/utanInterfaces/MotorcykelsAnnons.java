package HederligeHarry.utanInterfaces;

public class MotorcykelsAnnons extends FordonsAnnons{
    private final int motorVolym;
    private final String drivtyp;
    public MotorcykelsAnnons(String rubrik, String beskrivning, double pris, int årsmodell, int antalMil, int motorVolym, String drivtyp) {
        super(rubrik, beskrivning, pris, årsmodell, antalMil);
        this.motorVolym = motorVolym;
        this.drivtyp = drivtyp;
    }

    public int getMotorVolym(){
        return motorVolym;
    }

    public String getDrivtyp(){
        return drivtyp;
    }

    @Override
    public String getAnnonsText(){
        String annons = "Information om motorcykeln:\n";
        annons += getRubrik() + "\n";
        annons += "kostar: " + getPris() + "kr, ";
        annons += "årsmodell: " + getÅrsmodell() + ", ";
        annons += getAntalMil() + " mil";
        annons += " Motorvolym " + motorVolym;
        annons += ", Drivtyp " + drivtyp;
        annons += "\n" + getBeskrivning();
        return annons;
    }
}
