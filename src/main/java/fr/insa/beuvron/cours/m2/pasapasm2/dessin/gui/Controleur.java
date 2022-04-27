/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import javafx.scene.input.MouseEvent;

/**
 *
 * @author francois
 */
public class Controleur {
    
    private MainPane main;
    
    public enum Etat { SELECT, POINT, SEGMENTP1, SEGMENTP2}
    
    private Etat etat;
    
    public Controleur(MainPane main) {
        this.main = main;
    }
    public void clicDansDessin(MouseEvent t) {
        if (this.etat == Etat.POINT) {
            double px = t.getX();
        }
    }
    
    
}
