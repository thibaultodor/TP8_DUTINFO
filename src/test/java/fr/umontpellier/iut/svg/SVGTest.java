package fr.umontpellier.iut.svg;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;

public class SVGTest {

    @Test
    void image_SVG_vide() {
        Tag svg = new SVG(1024, 768);
        Node n = Utils.convertStringToXMLNode(svg.toSVG());
        assertEquals("svg", n.getNodeName());
        assertTrue(Utils.hasDoubleAttributes(n, new String[]{"width", "height"}, new double[]{1024, 768}));
    }

    @Test
    void rectangle(){
        Rectangle r = new Rectangle(8,6,34,49);

        String res = "<rect " + r.getParameters() + "/>";
        String ref = "<rect x=\"8.0\" y=\"6.0\" width=\"34.0\" height=\"49.0\"/>";

        assertEquals(ref, res);
    }

    @Test
    void cercle(){
        Circle r = new Circle(8,6,3);

        String res = "<circle " + r.getParameters() + "/>";
        String ref = "<circle cx=\"8.0\" cy=\"6.0\" r=\"3.0\"/>";
        assertEquals(ref, res);
    }

    @Test
    void group_cercle_et_rectangle(){

        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        String res = "<g>" + group.getContent() + "</g>";
        String ref = "<g><circle cx=\"2.0\" cy=\"2.0\" r=\"1.0\" /><rect x=\"5.0\" y=\"5.0\" width=\"3.0\" height=\"4.0\" /></g>";

        assertEquals(ref, res);
    }

    @Test
    void group_cercle_et_rectangle_rotate_style(){

        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        Rotate r = new Rotate(90,3,5);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        String res = "<g>" + group.getContent() + "</g>";
        String ref = "<g><circle cx=\"2.0\" cy=\"2.0\" r=\"1.0\" /><rect x=\"5.0\" y=\"5.0\" width=\"3.0\" height=\"4.0\" fill=\"green\" stroke=\"blue\" transform=\" rotate(90.0 3.0 5.0) \" /></g>";

        assertEquals(ref, res);
    }

    @Test
    void group_cercle_et_rectangle_rotate_scale_style(){

        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        Rotate r = new Rotate(90,3,5);
        Scale s = new Scale(3,3);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);stylerect.addTransform(s);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        String res = "<g>" + group.getContent() + "</g>";
        String ref = "<g><circle cx=\"2.0\" cy=\"2.0\" r=\"1.0\" /><rect x=\"5.0\" y=\"5.0\" width=\"3.0\" height=\"4.0\" fill=\"green\" stroke=\"blue\" transform=\" scale(3.0 3.0) rotate(90.0 3.0 5.0) \" /></g>";

        assertEquals(ref, res);
    }

    @Test
    void group_cercle_et_rectangle_rotate_scale_translate_style(){

        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        Rotate r = new Rotate(90,3,5);
        Scale s = new Scale(3,3);
        Translate t = new Translate(3,3);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);stylerect.addTransform(s);stylerect.addTransform(t);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        String res = "<g>" + group.getContent() + "</g>";
        String ref = "<g><circle cx=\"2.0\" cy=\"2.0\" r=\"1.0\" /><rect x=\"5.0\" y=\"5.0\" width=\"3.0\" height=\"4.0\" fill=\"green\" stroke=\"blue\" transform=\" translate(3.0 3.0) scale(3.0 3.0) rotate(90.0 3.0 5.0) \" /></g>";

        assertEquals(ref, res);
    }

    @Test
    void test_question13(){

        SVG img = new SVG(1000,1000);

        Style stylerect1 = new Style();stylerect1.setFill("lightblue");
        Rectangle rectangle1 = new Rectangle(0,0,1000.0,1000.0);
        rectangle1.setStyle(stylerect1);
        img.add(rectangle1);

        Style stylegroup1 = new Style();stylegroup1.setStroke("black");stylegroup1.setStrokeWidth(20.0);stylegroup1.setFillOpacity(0.8);
        Group group1 = new Group();
        group1.setStyle(stylegroup1);

        Style stylerect2 = new Style();stylerect2.setFill("#080");
        Rectangle rectangle2 = new Rectangle(100.0,100.0,200.0,200.0);
        rectangle2.setStyle(stylerect2);
        group1.add(rectangle2);

        Style stylerect3 = new Style();stylerect3.setFill("#0C0");
        Rectangle rectangle3 = new Rectangle(200.0,200.0,400.0,400.0);
        rectangle3.setStyle(stylerect3);
        group1.add(rectangle3);

        Translate t = new Translate(0,700);
        Rotate r = new Rotate(-45,100,50);
        Style stylegroup2 = new Style();stylegroup2.addTransform(r);stylegroup2.addTransform(t);
        Group group2 = new Group();
        group2.setStyle(stylegroup2);

        Style stylerect4 = new Style();stylerect4.setFill("#800");
        Rectangle rectangle4 = new Rectangle(100.0,100.0,200.0,200.0);
        rectangle4.setStyle(stylerect4);
        group2.add(rectangle4);

        Style stylerect5 = new Style();stylerect5.setFill("#C00");
        Rectangle rectangle5 = new Rectangle(200.0,200.0,400.0,400.0);
        rectangle5.setStyle(stylerect5);
        group2.add(rectangle5);

        group1.add(group2);

        img.add(group1);

        String res = img.getContent();
        String ref = "<rect x=\"0.0\" y=\"0.0\" width=\"1000.0\" height=\"1000.0\" fill=\"lightblue\" /><g stroke=\"black\" stroke-width=\"20.0\" fill-opacity=\"0.8\"><rect x=\"100.0\" y=\"100.0\" width=\"200.0\" height=\"200.0\" fill=\"#080\" /><rect x=\"200.0\" y=\"200.0\" width=\"400.0\" height=\"400.0\" fill=\"#0C0\" /><g transform=\" translate(0.0 700.0) rotate(-45.0 100.0 50.0) \"><rect x=\"100.0\" y=\"100.0\" width=\"200.0\" height=\"200.0\" fill=\"#800\" /><rect x=\"200.0\" y=\"200.0\" width=\"400.0\" height=\"400.0\" fill=\"#C00\" /></g></g>";

        assertEquals(ref, res);
    }

    @Test
    void group_cercle_et_rectangle_skewX(){

        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        SkewX r = new SkewX(10);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        String res = "<g>" + group.getContent() + "</g>";
        String ref = "<g><circle cx=\"2.0\" cy=\"2.0\" r=\"1.0\" /><rect x=\"5.0\" y=\"5.0\" width=\"3.0\" height=\"4.0\" fill=\"green\" stroke=\"blue\" transform=\" skewX(10.0) \" /></g>";

        assertEquals(ref, res);
    }
}
