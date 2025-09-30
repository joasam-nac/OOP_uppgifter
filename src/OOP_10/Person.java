package OOP_10;

abstract class Person {
    private final String namn;
    private String adress;
    private final String personnummer;
    private int ålder;

    protected Person(String namn, String adress, String personnummer, int ålder){
        this.namn = namn;
        this.adress = adress;
        this.personnummer = personnummer;
        this.ålder = ålder;
    }

    protected String getNamn(){
        return namn;
    }

    protected String getAdress(){
        return adress;
    }

    protected String getPersonnummer(){
        return personnummer;
    }

    protected int getÅlder(){
        return ålder;
    }

    protected void ändraAdress(String nyAdress){
        adress = nyAdress;
    }


}
