/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import static fr.insa.beuvron.cours.m2.pasapasm2.dessin.Point.TAILLE_POINT;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

/**
 *
 * @author francois
 */
public class Segment extends FigureSimple {

    private Point debut;
    private Point fin;

    public Segment(Point debut, Point fin, Color c) {
        super(c);
        this.debut = debut;
        this.fin = fin;
    }

    @Override
    public double distancePoint(Point p) {
        double x1 = this.debut.getPx();
        double y1 = this.debut.getPy();
        double x2 = this.fin.getPx();
        double y2 = this.fin.getPy();
        double x3 = p.getPx();
        double y3 = p.getPy();
        double up = ((x3 - x1) * (x2 - x1) + (y3 - y1) * (y2 - y1))
                / (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (up < 0) {
            return this.debut.distancePoint(p);
        } else if (up > 1) {
            return this.fin.distancePoint(p);
        } else {
            Point p4 = new Point(x1 + up * (x2 - x1),
                    y1 + up * (y2 - y1));
            return p4.distancePoint(p);
        }
    }

    /**
     * @return the debut
     */
    public Point getDebut() {
        return debut;
    }

    /**
     * @return the fin
     */
    public Point getFin() {
        return fin;
    }

    @Override
    public double maxX() {
        return Math.max(this.debut.maxX(), this.fin.maxX());
    }

    @Override
    public double minX() {
        return Math.min(this.debut.minX(), this.fin.minX());
    }

    @Override
    public Group dessine() {
        Line li = new Line(this.getDebut().getPx(), this.getDebut().getPy(),
                this.getFin().getPx(), this.getFin().getPy());
         li.setStroke(this.getCouleur());
        li.setFill(this.getCouleur());
       Group res = new Group(li);
        return res;
    }

}
