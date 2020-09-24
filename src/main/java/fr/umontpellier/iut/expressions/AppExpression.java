package fr.umontpellier.iut.expressions;

public class AppExpression {

    public static void main(String[] args) {
        Expression un = new Nombre(10);
        Expression deux = new Nombre(2);
        Expression op = new Operation('/',un,deux);
        Expression op2 = new Operation('/',un,deux);
        Expression op3 = new Operation('+',op,op2);
        System.out.println(op3);
        double resultat = op3.calculerValeur();
        System.out.println(resultat);
    }
}
