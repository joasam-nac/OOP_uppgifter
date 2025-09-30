package HederligeHarry.utanInterfaces;

public class MotorcykelsAnnons extends FordonsAnnons{
    private int motorVolym;
    private String drivtyp;
    public MotorcykelsAnnons(String rubrik, String beskrivning, double pris, int årsmodell, int antalMil) {
        super(rubrik, beskrivning, pris, årsmodell, antalMil);
    }
}
