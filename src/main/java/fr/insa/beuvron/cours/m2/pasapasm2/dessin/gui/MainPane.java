/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import fr.insa.beuvron.cours.m2.pasapasm2.dessin.Groupe;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author francois
 */
public class MainPane extends BorderPane {
    
    private Groupe model;
    private Controleur control;
    
    private OutilsTop entete;
    private OutilsLeft barreGauche;
    private DessinPane dessin;
    
    public MainPane(Groupe model) {
        this.model = model;
        this.control = new Controleur(this);
        
        this.entete = new OutilsTop();
        this.barreGauche = new OutilsLeft(this);
        this.dessin = new DessinPane(this);
        
        this.setTop(this.entete);
        this.setLeft(this.barreGauche);
        this.setCenter(this.dessin);
    }

    /**
     * @return the model
     */
    public Groupe getModel() {
        return model;
    }

    /**
     * @return the control
     */
    public Controleur getControl() {
        return control;
    }
    
}
