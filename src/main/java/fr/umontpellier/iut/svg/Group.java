package fr.umontpellier.iut.svg;

import java.util.LinkedList;
import java.util.List;

public class Group extends ElementsSVG {

    private List<ElementsSVG> content;

    public Group() {
        super("g");
        this.content = new LinkedList<>();
    }

    public void add(ElementsSVG t){
        content.add(t);
    }

    @Override
    public String getContent() {
        SVG svg = new SVG(0,0);
        for(ElementsSVG element:content){
            svg.add(element);
        }
        return svg.getContent();
    }
}
