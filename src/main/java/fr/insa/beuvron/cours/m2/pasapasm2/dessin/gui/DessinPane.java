/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author francois
 */
public class DessinPane extends Pane{
    
    private MainPane main;
    
    public DessinPane(MainPane main){
        this.main = main;
        Rectangle clip = new Rectangle();
        clip.heightProperty().bind(this.heightProperty());
        clip.widthProperty().bind(this.widthProperty());
        this.setClip(clip);
        this.setOnMouseClicked((t) -> {
            this.main.getControl().clicDansDessin(t);
        });
        FxUtils.setSimpleBorder(this, Color.RED, 3);
        this.redrawAll();
    }
    
    public void redrawAll() {
        this.getChildren().clear();
        this.getChildren().add(this.main.getModel().dessine());
    }
     
}
