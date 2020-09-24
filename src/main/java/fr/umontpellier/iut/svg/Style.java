package fr.umontpellier.iut.svg;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Modélisation des paramètres de style d'une balise SVG
 */
public class Style {

    /**
     * Couleur de remplissage
     */
    private String fill;

    /**
     * Couleur du tracé
     */
    private String stroke;

    /**
     * Épaisseur du trait
     */
    private Double strokeWidth;

    /**
     * Transparence du remplissage
     */
    private Double fillOpacity;

    private ArrayList<Transformation> transform = new ArrayList<>();

    /**
     * Renvoie la représentation du style sous forme d'une chaîne de caractères qui peut être insérée dans une
     * balise SVG.
     *
     * @return représentation du style au format SVG
     */
    public String toSVG() {
        StringJoiner elements = new StringJoiner(" ");
        if (fill != null) {
            elements.add("fill=\"" + fill + "\"");
        }
        if (stroke != null) {
            elements.add("stroke=\"" + stroke + "\"");
        }
        if (strokeWidth != null) {
            elements.add("stroke-width=\"" + strokeWidth + "\"");
        }
        if (fillOpacity != null) {
            elements.add("fill-opacity=\"" + fillOpacity + "\"");
        }
        if (!transform.isEmpty()){
            elements.add("transform=\"");
            for (int i = transform.size()-1; i >= 0 ; i--) {
                elements.add(transform.get(i).toString());
            }
            elements.add("\"");
        }
        return elements.toString();
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public void setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public void addTransform(Transformation t){ transform.add(t); }
}
