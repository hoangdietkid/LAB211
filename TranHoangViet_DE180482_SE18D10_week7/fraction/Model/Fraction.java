package TranHoangViet_DE180482_SE18D10_week7.fraction.Model;

public class Fraction implements Comparable<Fraction> {
    private int numerator, denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Fatal Error: Can not set denominator to zero");
            System.exit(1);
        }
        if (denominator < 0) {
            numerator = numerator * (-1);
            denominator *= -1;
        }

        this.numerator = numerator;
        this.denominator = denominator;

        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        reduce();
    }

    public void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);
            numerator = numerator / common;
            denominator = denominator / common;
        } else
            denominator = 1;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Fraction add(Fraction frac) {
        int a, b, c, d;
        a = this.numerator;
        b = this.denominator;
        c = frac.getNumerator();
        d = frac.getDenominator();
        return new Fraction(a * d + b * c, b * d);
    }

    @Override
    public String toString() {
        String result;
        if (numerator == 0)
            result = "0";
        else if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;

        return result;
    }

    @Override
    public int compareTo(Fraction other) {
        return Integer.compare(this.numerator * other.denominator, this.denominator * other.numerator);
    }

}
