package OOP_8;

import java.util.HashMap;

public class Figurfabrik {
    private final HashMap<String, String> giltigaFigurer = new HashMap<>();

    public Figurfabrik(){
        giltigaFigurer.put("rund","cirkel");
        giltigaFigurer.put("trekantig","triangel");
        giltigaFigurer.put("fyrkantig","rektangel");
    }

    public void getFigur(String form){
        if(giltigaFigurer.get(form) != null){
            System.out.println(giltigaFigurer.get(form));
        } else {
            System.out.println(form + " finns inte bland figuer!");
        }
    }

    static void main(){
        Figurfabrik f1 = new Figurfabrik();
        f1.getFigur("rund");
        f1.getFigur("trekantig");
        f1.getFigur("fyrkantig");
        f1.getFigur("femkantig");
    }
}
