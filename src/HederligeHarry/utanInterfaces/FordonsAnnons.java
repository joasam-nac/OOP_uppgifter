package HederligeHarry.utanInterfaces;

public class FordonsAnnons {
        private String rubrik, beskrivning;
        private double pris;
        private final int årsmodell;
        private int antalMil;

        public FordonsAnnons(String rubrik, String beskrivning, double pris, int årsmodell, int antalMil){
            this.rubrik = rubrik;
            this.beskrivning = beskrivning;
            this.pris = pris;
            this.årsmodell = årsmodell;
            this.antalMil = antalMil;
        }

        public void ändraRubrik(String nyRubrik){
            rubrik = nyRubrik;
        }

        public void ändraBeskrivning(String nyBeskrivning){
            beskrivning = nyBeskrivning;
        }

        public void ändraPris(double nyttPris){
            pris = nyttPris;
        }

        public void ökaMil(int nyaMil){
            antalMil += nyaMil;
        }

        public String getRubrik() {
            return rubrik;
        }

        public String getBeskrivning() {
            return beskrivning;
        }

        public double getPris() {
            return pris;
        }

        public int getÅrsmodell() {
            return årsmodell;
        }

        public int getAntalMil() {
            return antalMil;
        }

        public String getAnnonsText(){
                String annons = "Information om fordonet:\n";
                annons += rubrik + "\n";
                annons += "kostar: " + pris + "kr, ";
                annons += "årsmodell: " + årsmodell + ", ";
                annons += antalMil + " mil";
                annons += "\n" + beskrivning;
                return annons;
            }


}
