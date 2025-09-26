package OOP_3;

public class Person {
    private final String namn;
    private String adress;
    private int ålder;

    public Person(String namn, String adress, int ålder) {
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }


    public String getNamn() {
        return namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getÅlder() {
        return ålder;
    }

    public void ökaÅlder(){
        ålder++;
    }
}
