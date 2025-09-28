package OOP_7;

import java.util.LinkedList;
import java.util.List;



public class Main {
    public static void main(String[] args){
        Kvadrat k1 = new Kvadrat(new Punkt(2,3));
        Cirkel c1 = new Cirkel(new Punkt(3,5));
        /*List<Figur> figurlista = new LinkedList<>();
        figurlista.add(k1);
        figurlista.add(c1);

        for (int i = 0; i<figurlista.toArray().length; i++){
            System.out.println(figurlista.get(i).toString());
        }*/

        List figurlista = new LinkedList();
        figurlista.add(k1);
        figurlista.add(c1);

        for (int i = 0; i<figurlista.toArray().length; i++){
            System.out.println(figurlista.get(i).toString());
        }



    }


}
