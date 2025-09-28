package OOP_7;

public class Kvadrat extends Figur{
    private Area area = new Area();
    private Punkt startPunkt;

    public Kvadrat(Punkt koordinater){
        this.startPunkt = koordinater;
    }

    public void Area(){
        double yta = startPunkt.getX() * startPunkt.getY();
        if (!(area.getStorlek() == yta)){
            area.setStorlek(yta);
        }
    }

    public String toString(){
        return "Information om kvadrat: " + "\n\tArea: " + area.getStorlek() + "\n\t(x,y): (" + startPunkt.getX() + "," + startPunkt.getY() + ")";
    }
}
