package OOP_7;

public class Cirkel extends Figur {
    private Area area = new Area();
    private Punkt startPunkt;

    public Cirkel(Punkt koordinater){
        this.startPunkt = koordinater;
        Area();
    }

    public void Area(){
        double radie = Math.sqrt(startPunkt.getX() * startPunkt.getX() + startPunkt.getY() * startPunkt.getY());
        double yta = radie * radie * Math.PI;
        if (!(area.getStorlek() == yta)){
            area.setStorlek(yta);
        }
    }

    public void bytPunkt(Punkt nyPunkt){
        startPunkt = nyPunkt;
    }

    public String toString(){
        return "Information om Cirkel: " + "\n\tArea: " + area.getStorlek() + "\n\t(x,y): (" + startPunkt.getX() + "," + startPunkt.getY() + ")";
    }
}
