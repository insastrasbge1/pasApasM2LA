/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin.gui;

import fr.insa.beuvron.cours.m2.pasapasm2.dessin.Groupe;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author francois
 */
public class MainFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Groupe model= Groupe.groupeAlea(10, 5);
        MainPane main = new MainPane(model);
        Scene sc = new Scene(main);
        stage.setScene(sc);
        stage.setTitle("Boite à Coucou");
          stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
