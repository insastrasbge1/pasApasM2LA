/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.testFx;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author francois
 */
public class CoucouPanel extends BorderPane {
    
    private BorderPane entete;
    private Label lNom;
    private TextField tfNom;
    
    private TextArea messages;
    
    private HBox boutons;
    private Button bCoucou;
    private Button bSalut;
    
    
    public CoucouPanel() {
        
        this.lNom = new Label("nom :");
        this.tfNom = new TextField();
        this.entete = new BorderPane();
        this.entete.setLeft(this.lNom);
        this.entete.setCenter(this.tfNom);
        
        this.setTop(this.entete);
        
        this.messages = new TextArea();
        this.setCenter(this.messages);
        
        this.bCoucou = new Button("Coucou");
        
        this.bCoucou.setOnAction((t) -> {
            String nom = this.tfNom.getText();
            this.messages.appendText("coucou " + nom + "\n");
        });
        this.bSalut = new Button("Salut");
       this.bSalut.setOnAction((t) -> {
            String nom = this.tfNom.getText();
            this.messages.appendText("coucou " + nom + "\n");
        });
         this.boutons = new HBox();
        this.boutons.getChildren().add(this.bCoucou);
        this.boutons.getChildren().add(this.bSalut);
        this.setBottom(this.boutons);
        
 
    }
    
}
