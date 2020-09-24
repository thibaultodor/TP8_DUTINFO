package fr.umontpellier.iut.svg;

public class Circle extends ElementsSVG {
    private double cx;  //Position en x du centre
    private double cy;  //Position en y du centre
    private double r;   //Taille du rayon

    public Circle(double cx, double cy, double r) {
        super("circle");
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public String getParameters() {
        return "cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\"";
    }
}
