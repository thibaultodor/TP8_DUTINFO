package fr.umontpellier.iut.expressions;

import javax.swing.*;

public class Nombre implements Expression {

    private double valeur;

    public Nombre(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public double calculerValeur() {
        return valeur;
    }
}
