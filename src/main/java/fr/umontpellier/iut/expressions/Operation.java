package fr.umontpellier.iut.expressions;

public class Operation implements Expression {

    private char operateur;
    private Expression expressionGauche;
    private Expression expressionDroite;

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
         this.operateur = operateur;
         this.expressionGauche = expressionGauche;
         this.expressionDroite = expressionDroite;
    }

    @Override
    public double calculerValeur() {
        double res = 0;
        switch (operateur) {
            case '+': res = expressionGauche.calculerValeur() + expressionDroite.calculerValeur();break;
            case '-': res = expressionGauche.calculerValeur() - expressionDroite.calculerValeur();break;
            case '*': res = expressionGauche.calculerValeur() * expressionDroite.calculerValeur();break;
            case '/':
                if(expressionDroite.calculerValeur() != 0) {
                    res = expressionGauche.calculerValeur() / expressionDroite.calculerValeur();break;
                }
                else{
                    throw new RuntimeException("Division par zéro");
                }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "(";
        res = getString(res, expressionGauche);
        res = res+operateur;
        res = getString(res, expressionDroite);
        res = res+")";
        return res;
    }

    private String getString(String res, Expression expression) {
        if(expression.getClass() == Nombre.class){
            int intPart = (int) expression.calculerValeur();
            if(expression.calculerValeur() % 1 == 0){ res = res+intPart; }
            else {res = res + expression.calculerValeur(); }
        }
        else{ res = res + expression.toString(); }
        return res;
    }
}
