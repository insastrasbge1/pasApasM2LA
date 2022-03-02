/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.awt.Color;


/**
 *
 * @author francois
 */
public abstract class FigureSimple extends Figure{
    
    private Color couleur;

    public FigureSimple(Color couleur) {
        this.couleur = couleur;
    }
    
    

    /**
     * @return the couleur
     */
    public Color getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
 
    
    
}
