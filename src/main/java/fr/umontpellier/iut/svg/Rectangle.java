package fr.umontpellier.iut.svg;

public class Rectangle extends ElementsSVG {
    private double x;
    private double y;
    private double width;
    private double height;
    private double rx;
    private double ry;

    public Rectangle(double x, double y, double width, double height, double rx, double ry) {
        this(x, y, width, height);
        this.rx = rx;
        this.ry = ry;
    }

    public Rectangle(double x, double y, double width, double height) {
        super("rect");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle (Rectangle rectangle){
        this(rectangle.x,rectangle.y,rectangle.width,rectangle.height,rectangle.rx,rectangle.ry);
    }

    @Override
    public String getParameters() {
        if(rx == 0 && ry == 0) { return "x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\""; }
        else if(ry == 0){ return "x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" rx=\"" + rx + "\""; }
        else if(rx == 0){ return "x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" ry=\"" + ry + "\""; }
        else{ return "x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" rx=\"" + rx + "\" ry=\"" + ry + "\""; }
    }
}