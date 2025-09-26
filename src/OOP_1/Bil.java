package OOP_1;

public class Bil {
    private String modell, märke;
    private Bilägare ägare;
    private final String registreringsnummer;

    public Bil(String registreringsnummer, String modell, String märke, Bilägare ägare){
        this.registreringsnummer = registreringsnummer;
        this.modell = modell;
        this.märke = märke;
        this.ägare = ägare;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Bilägare getÄgare() {
        return ägare;
    }

    //säljer eller köper bil
    public void bytaÄgare(Bilägare nyÄgare){
        System.out.println("Bil med registreringsnummer " + registreringsnummer + " bytte ägare från " + ägare.toString() + " till " + nyÄgare.toString());
        ägare = nyÄgare;
    }

    @Override
    public String toString() {
        return märke + " " + modell + " med registreringsnummer " + registreringsnummer + " ägs av " + ägare.toString();
    }
}
