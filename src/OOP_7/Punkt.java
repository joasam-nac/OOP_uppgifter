package OOP_7;

public class Punkt {
    public int getY() {
        return y;
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x,y;
}
