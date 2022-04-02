/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 *
 * @author francois
 */
public class OutilsLeft extends VBox {

    private ToggleButton bSelect;
    private ToggleButton bPoint;
    private ToggleButton bSegment;

    public OutilsLeft() {
        this.bSelect = new ToggleButton("select");
        this.bPoint = new ToggleButton("point");
        this.bSegment = new ToggleButton("segment");
        
 
        ToggleGroup tg = new ToggleGroup();
        
        this.bSelect.setToggleGroup(tg);
        this.bPoint.setToggleGroup(tg);
        this.bSegment.setToggleGroup(tg);
       this.bPoint.setSelected(true);

        this.getChildren().addAll(this.bSelect, this.bPoint, this.bSegment);

    }

}
