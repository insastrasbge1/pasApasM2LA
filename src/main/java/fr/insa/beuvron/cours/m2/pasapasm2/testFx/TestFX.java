/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.testFx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author francois
 */
public class TestFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        CoucouPanel main = new CoucouPanel();
        Scene sc = new Scene(main);
        stage.setScene(sc);
        stage.setTitle("Boite à Coucou");
          stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
