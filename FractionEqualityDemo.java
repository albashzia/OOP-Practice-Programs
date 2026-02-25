class Fraction {
    private int numerator;
    private int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int a, int b) {
        numerator = a;
        denominator = b;
    }

    public void set(int x, int y) {
        numerator = x;
        denominator = y;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public boolean equals(Fraction other) {
        return numerator * other.denominator == denominator * other.numerator;
    }
}

public class FractionEqualityDemo {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.set(1, 2);

        Fraction f2 = new Fraction(2, 4);

        f1.display();
        f2.display();

        System.out.println("Are equal: " + f1.equals(f2));
    }
}