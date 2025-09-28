package OOP_9;

public enum Romersksiffra {
    M(1000),
    //CM(900),
    D(500),
    //CD(400),
    C(100),
    //XC(90),
    L(50),
    //XL(40),
    X(10),
    //IX(9),
    V(5),
    //IV(4),
    I(1);

    private final int value;

    Romersksiffra(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static String toRoman(int number) {
        StringBuilder sb = new StringBuilder();
        for (Romersksiffra symbol : Romersksiffra.values()) {
            while (number >= symbol.value) {
                number -= symbol.value;
                sb.append(symbol.name());
            }
        }
        return sb.toString();
    }

    public static void main() {
        System.out.println(toRoman(1337));
        System.out.println(toRoman(42));
        System.out.println(toRoman(4200));
    }
}