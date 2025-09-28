package OOP_7;

public class Area {
    private double storlek;

    public Area(double storlek){
        this.storlek = storlek;
    }

    public Area(){
        this.storlek = 0.0;
    }

    public double getStorlek() {
        return storlek;
    }

    public void setStorlek(double storlek) {
        this.storlek = storlek;
    }

    public boolean equals(Area annanArea){
        return storlek == annanArea.getStorlek();
    }
}
