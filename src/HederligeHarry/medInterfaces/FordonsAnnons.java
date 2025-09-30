package HederligeHarry.medInterfaces;

public abstract class FordonsAnnons {
    int pris;
    int årsmodell;
    String rubrik;
    String beskrivning;
    int antalMil;

    public FordonsAnnons(int pris, int årsmodell, String rubrik, String beskrivning, int antalMil){
        this.pris = pris;
        this.årsmodell = årsmodell;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.antalMil = antalMil;
    }

    public int getAntalMil() {
        return antalMil;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }
}
