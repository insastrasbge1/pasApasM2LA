/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import fr.insa.beuvron.recup.Lire;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javafx.scene.Group;

/**
 *
 * @author francois
 */
public abstract class Figure {

    private Groupe contenuDans;

    public abstract double maxX();

    public abstract double minX();

    public abstract void save(Writer out) throws IOException;

    public void sauvegarde(File fout) throws IOException {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(fout));
            this.save(out);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public void sauvegarde2(File fout) throws IOException {
        try ( Writer out = new BufferedWriter(new FileWriter(fout))) {
            this.save(out);
        }
    }

    public static void testeSauvegarde() {
        Groupe test = Groupe.groupeAlea(10, 5);
        File cur = new File(".");
        System.out.println("répertoire courant : " + cur.getAbsolutePath());
        System.out.println("entrez le nom du fichier : ");
        String nom = Lire.S();
        File fout = new File(nom);
        try {
            test.sauvegarde(fout);
        } catch (IOException ex) {
            System.out.println("probleme : " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void testConversion() {
        while (true) { 
            System.out.println("entrez un nombre : ");
            String s = Lire.S();
            double d = 0;
            try {
                d = Double.parseDouble(s);
                System.out.println("vous avez entré " + d);
            } catch (NumberFormatException ex) {
                System.out.println("c'est pas un nombre");
            }
        }
    }

    public double largeur() {
        return this.maxX() - this.minX();
    }

    public abstract double distancePoint(Point p);

    public static void main(String[] args) {
        testConversion();
//        testeSauvegarde();
//        Point p1, p2;
//        p1 = new Point();
//        p1.setPx(2);
//        p1.setPy(3);
//        System.out.println("p1 : (" + p1.getPx() + "," + p1.getPy() + ")");
//        p2 = p1;
//        p1.setPx(4);

    }

    public abstract Group dessine();

    /**
     * @return the contenuDans
     */
    public Groupe getContenuDans() {
        return contenuDans;
    }

    /**
     * @param contenuDans the contenuDans to set
     */
    public void setContenuDans(Groupe contenuDans) {
        this.contenuDans = contenuDans;
    }

}
