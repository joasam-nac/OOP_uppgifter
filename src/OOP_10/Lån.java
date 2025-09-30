package OOP_10;

import java.util.HashMap;
import java.util.Map;

public class Lån implements Tillgång {
    private double lånBelopp;
    private double räntesats;
    private final Personal anställd;
    private final HashMap<Double, Personal> tidigareRäntesatser;

    public Lån(double lånBelopp, double räntesats, Personal anställd) {
        this.lånBelopp = lånBelopp;
        this.räntesats = räntesats;
        this.anställd = anställd;
        this.tidigareRäntesatser = new HashMap<>();
        this.tidigareRäntesatser.put(this.räntesats, this.anställd);
    }

    public void amortera(double belopp) {
        lånBelopp -= belopp;
        if (lånBelopp < 0) {
            lånBelopp = 0;
        }
    }

    public double getLåneBelopp() {
        return lånBelopp;
    }

    public double getRäntesats() {
        return räntesats;
    }

    public void ändraRäntesats(double nyRäntesats, Personal beviljadAv) {
        this.räntesats = nyRäntesats;
        tidigareRäntesatser.put(nyRäntesats, beviljadAv);
    }

    public Personal getBeviljadAv() {
        return anställd;
    }

    @Override
    public String Historik() {
        StringBuilder historik = new StringBuilder("Historik över räntesatser för lånet:\n");
        for (Map.Entry<Double, Personal> entry : tidigareRäntesatser.entrySet()) {
            historik.append("Räntesats: ")
                    .append(entry.getKey())
                    .append(" beviljad av: ")
                    .append(entry.getValue().getNamn())
                    .append("\n");
        }
        return historik.toString();
    }
}