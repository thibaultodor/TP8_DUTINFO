package fr.umontpellier.iut.svg;

import java.sql.PreparedStatement;
import java.util.LinkedList;

public class AppSVG {
    public static void main(String[] args) {

        /*
        Circle cercle = new Circle(200,200,100);
        Rectangle rectangle = new Rectangle(500,500,300,400);

        Style stylerect = new Style();
        stylerect.setFill("green");
        stylerect.setStroke("blue");

        Style stylecercle = new Style();
        stylecercle.setFill("red");
        stylecercle.setStroke("black");

        //System.out.println(cercle.toSVG());
        //System.out.println(rectangle.toSVG());

        cercle.setStyle(stylecercle);
        rectangle.setStyle(stylerect);

        SVG img = new SVG(1000,1000);

        img.add(cercle);
        img.add(rectangle);
        img.saveAsFile("cercle_rectangle.svg");
         */

        /*
        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);

        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");
        Style stylecercle = new Style();stylecercle.setFill("red");stylecercle.setStroke("black");

        cercle.setStyle(stylecercle);
        rectangle.setStyle(stylerect);

        SVG img = new SVG(10,10);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        img.add(group);

        img.saveAsFile("cr_group.svg");
         */
        /*
        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);

        Rotate r = new Rotate(10,1,1);
        Scale s = new Scale(1,1);
        Translate t = new Translate(0,1);

        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);stylerect.addTransform(s);stylerect.addTransform(t);
        Style stylecercle = new Style();stylecercle.setFill("red");stylecercle.setStroke("black");

        cercle.setStyle(stylecercle);
        rectangle.setStyle(stylerect);

        SVG img = new SVG(10,10);
        Group group = new Group();group.add(cercle);group.add(rectangle);

        img.add(group);

        img.saveAsFile("cr_group_transform_v2.svg");
        */

        /*
        Rectangle rectangle = new Rectangle(5,5,3,4,0,1);

        SVG img = new SVG(10,10);
        Group group = new Group();group.add(rectangle);

        img.add(rectangle);

        img.saveAsFile("rectangle_arrondie.svg");
        */

        /*
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

        img.saveAsFile("question_13.svg");
        */

        /*
        SVG img = new SVG(1000,1000);

        Style stylegroup = new Style();stylegroup.setStroke("black");stylegroup.setStrokeWidth(10.0);stylegroup.setFillOpacity(0.5);
        Group group = new Group();
        group.setStyle(stylegroup);

        Circle cercle1 = new Circle(500,650,300);
        Circle cercle2 = new Circle(500,650,300);
        Circle cercle3 = new Circle(500,650,300);

        Rotate rg = new Rotate(120,500,500);
        Rotate rb = new Rotate(240,500,500);

        Style stylecercleTran = new Style();stylecercleTran.setFill("red");
        cercle1.setStyle(stylecercleTran);
        group.add(cercle1);

        Style stylecercleRot = new Style();stylecercleRot.setFill("green");stylecercleRot.addTransform(rg);
        cercle2.setStyle(stylecercleRot);
        group.add(cercle2);

        Style stylecercleRotg = new Style();stylecercleRotg.setFill("blue");stylecercleRotg.addTransform(rb);
        cercle3.setStyle(stylecercleRotg);
        group.add(cercle3);

        img.add(group);

        img.saveAsFile("question_14.svg");
         */

        /*
        SVG img = new SVG(10,10);
        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        SkewX r = new SkewX(10);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);
        img.add(group);
        img.saveAsFile("skewX.svg");
         */

        /*
        SVG img = new SVG(10,10);
        Circle cercle = new Circle(2,2,1);
        Rectangle rectangle = new Rectangle(5,5,3,4);
        SkewY r = new SkewY(10);
        Style stylerect = new Style();stylerect.setFill("green");stylerect.setStroke("blue");stylerect.addTransform(r);
        rectangle.setStyle(stylerect);
        Group group = new Group();group.add(cercle);group.add(rectangle);
        img.add(group);
        img.saveAsFile("skewY.svg");
        */

        SVG img = new SVG(1000,1000);
        Group gfond = new Group();
        Group gcotevert = new Group();
        Group gcoterouge = new Group();
        Group gcotebleu = new Group();

        SkewX sk1 = new SkewX(30);
        SkewX sk2 = new SkewX(-30);

        Rotate r = new Rotate(30,500,300);
        Rotate r2 = new Rotate(150,500,500);
        Rotate r3 = new Rotate(30,500,500);

        Translate t2 = new Translate(655,-325);
        Translate t3 = new Translate(649,123.5);

        Scale scalecarre = new Scale(0.30,0.30);

        Scale scalefondbleu1 = new Scale(0.95, 0.95);
        Scale scalefondbleu2 = new Scale(0.99, 0.98);

        Style stylecreefond = new Style();stylecreefond.setFill("black");
        gfond.setStyle(stylecreefond);

        Style stylefond1 = new Style();stylefond1.addTransform(sk1);stylefond1.addTransform(r);
        Style stylefond2 = new Style();stylefond2.addTransform(sk2);stylefond2.addTransform(t2);stylefond2.addTransform(r2);
        Style stylefond3 = new Style();stylefond3.addTransform(sk2);stylefond3.addTransform(r3);stylefond3.addTransform(scalefondbleu1);stylefond3.addTransform(scalefondbleu2);stylefond3.addTransform(t3);

        Rectangle fond1 = new Rectangle(25,500,300,300);
        Rectangle fond2 = new Rectangle(fond1);
        Rectangle fond3 = new Rectangle(25,500,320,276);

        gcotevert.setStyle(stylefond1);gcotevert.add(fond1);
        Group ensemblvert = new Group();Style sensemblevert = new Style();sensemblevert.setFill("Green");ensemblvert.setStyle(sensemblevert);
        for (int j = 0;j<3;j++) {
            for (int i = 0; i < 3; i++) {
                Rectangle carrevert = new Rectangle(25, 500, 300, 300, 30, 30);
                Translate tvert = new Translate(25 + (98 * i), 360 + (96 * j));
                Style scarrevert = new Style();scarrevert.addTransform(scalecarre);scarrevert.addTransform(tvert);carrevert.setStyle(scarrevert);
                ensemblvert.add(carrevert);
            }
        }
        gcotevert.add(ensemblvert);

        gcoterouge.setStyle(stylefond2);gcoterouge.add(fond2);
        Group ensemblrouge = new Group();Style sensemblrouge = new Style();sensemblrouge.setFill("Red");ensemblrouge.setStyle(sensemblrouge);
        for (int j = 0;j<3;j++) {
            for (int i = 0; i < 3; i++) {
                Rectangle carrerouge = new Rectangle(25, 500, 300, 300, 30, 30);
                Translate trouge = new Translate(25 + (98 * i), 358 + (96 * j) );
                Style scarrouge = new Style();scarrouge.addTransform(scalecarre);scarrouge.addTransform(trouge);carrerouge.setStyle(scarrouge);
                ensemblrouge.add(carrerouge);
            }
        }
        gcoterouge.add(ensemblrouge);

        gcotebleu.setStyle(stylefond3);gcotebleu.add(fond3);
        Group ensemblbleu = new Group();Style sensemblbleu = new Style();sensemblbleu.setFill("Blue");ensemblbleu.setStyle(sensemblbleu);
        for (int j = 0;j<3;j++) {
            for (int i = 0; i < 3; i++) {
                Rectangle carrebleu = new Rectangle(25, 500, 320, 276, 30, 30);
                Translate tbleu = new Translate(28 + (105 * i), 359.5 + (91 * j) );
                Style scarbleu = new Style();scarbleu.addTransform(scalecarre);scarbleu.addTransform(tbleu);carrebleu.setStyle(scarbleu);
                ensemblbleu.add(carrebleu);
            }
        }
        gcotebleu.add(ensemblbleu);


        gfond.add(gcotevert);gfond.add(gcoterouge);gfond.add(gcotebleu);img.add(gfond);
        img.saveAsFile("Rubik.svg");
    }
}
