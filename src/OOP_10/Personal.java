package OOP_10;

public class Personal extends Person{
    private double lön;
    private String befattning;
    protected Personal(String namn, String adress, String personnummer, int ålder, double lön, String befattning) {
        super(namn, adress, personnummer, ålder);
        this.lön = lön;
        this.befattning = befattning;
    }

    public void ökaLön(double procent){
        lön *= 1.0+procent/100.0;
    }

    public void ändraBefattning(String nyBefattning){
        befattning = nyBefattning;
    }

    public double getLön() {
        return lön;
    }

    public String getBefattning() {
        return befattning;
    }
}
