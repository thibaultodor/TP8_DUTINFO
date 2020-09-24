package fr.umontpellier.iut.svg;

public class Translate implements Transformation {
    private double x;
    private double y;

    public Translate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "translate(" +
                 x +
                ' ' + y +
                ')';
    }
}
