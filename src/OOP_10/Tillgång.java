package OOP_10;

import java.util.HashMap;

interface Tillgång {
    double getRäntesats();
    void ändraRäntesats(double räntesats, Personal beviljadAv);
    String Historik();
}
