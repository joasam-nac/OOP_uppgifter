package OOP_10;

import java.util.HashMap;
import java.util.Map;

public class Konto implements Tillgång{
    private double saldo;
    private double räntesats;
    private final HashMap<Double, Personal> tidigareRäntesatser;

    public Konto(double räntesats, Personal beviljadAv) {
        this.saldo = 0.0;
        this.räntesats = räntesats;
        this.tidigareRäntesatser = new HashMap<>();
        this.tidigareRäntesatser.put(räntesats, beviljadAv);
    }

    public double getSaldo() {
        return saldo;
    }

    public void ökaSaldo(double värde) {
        saldo += värde;
    }

    public void ändraRäntesats(double nyRäntesats, Personal beviljadAv) {
        this.räntesats = nyRäntesats;
        tidigareRäntesatser.put(nyRäntesats, beviljadAv);
    }

    public void ränteTillväxt() {
        saldo *= 1.0 + räntesats;
    }

    public double getRäntesats() {
        return räntesats;
    }

    public String Historik() {
        StringBuilder historik = new StringBuilder("Historik om kontot:\n");
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