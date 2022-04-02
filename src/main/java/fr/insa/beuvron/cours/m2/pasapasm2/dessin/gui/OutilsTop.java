/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class OutilsTop extends HBox{
    
    private ColorPicker couleurs;
    private Button bZoomIn;
    private Button bZoomOut;
    
    public OutilsTop() {
        this.couleurs = new ColorPicker(Color.BLACK);
        this.bZoomIn = new Button("Zoom *2");
        this.bZoomOut = new Button("Zoom /2");
        
        this.getChildren().add(this.couleurs);
        this.getChildren().add(this.bZoomIn);
        this.getChildren().add(this.bZoomOut);
        
    }
    
}
