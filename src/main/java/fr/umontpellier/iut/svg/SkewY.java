package fr.umontpellier.iut.svg;

public class SkewY implements Transformation {
    private double a;

    public SkewY(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "skewY(" + a + ')';
    }
}