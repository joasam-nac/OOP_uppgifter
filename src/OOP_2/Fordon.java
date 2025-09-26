package OOP_2;

public abstract class Fordon {
    private int hastighet, vikt;

    public Fordon(int hastighet, int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getVikt(){
        return vikt;
    }

    public int getHastighet(){
        return hastighet;
    }

    public void ändraHastighet(int nyHastighet){
        if (nyHastighet > hastighet){
            System.out.println("Ökar hastigheten tll: " + nyHastighet);
        } else if (nyHastighet < hastighet){
            System.out.println("Sänker hastigheten till: " + nyHastighet);
        } else {
            System.out.println("Hastigheten ändrades inte");
            return;
        }
        this.hastighet = nyHastighet;
    }
}
