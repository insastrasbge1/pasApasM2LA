/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;


/**
 *
 * @author francois
 */
public class Point extends FigureSimple {
    
    public static final double TAILLE_POINT = 5;

    private double px;
    private double py;

    public Point() {
        this(0, 0);
    }

    public Point(double px, double py) {
        this(px, py, new Color(0, 0, 0,1));
    }

    public Point(double px, double py, Color c) {
        super(c);
        this.px = px;
        this.py = py;
    }

    @Override
    public double distancePoint(Point p) {
        double dx = p.px - this.px;
        double dy = p.py - this.py;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getPx() {
        return this.px;
    }

    public void setPx(double px) {
        this.px = px;
    }

//    @Override
//    public String toString() {
//        return "(" + this.px + "," + this.py + ")";
//    }

    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p1.px = 2;
        p1.py = 3;
        System.out.println("p1 : (" + p1.px + "," + p1.py + ")");
        p2 = p1;
        p2.px = 4;
        System.out.println("p2 : (" + p2.px + "," + p2.py + ")");
        System.out.println("p1 : (" + p1.px + "," + p1.py + ")");
        System.out.println("p1 = " + p1.toString());
        double x = 3.1;
        System.out.println("x : " + x);
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    @Override
    public double maxX() {
        return this.px;
     }

    @Override
    public double minX() {
        return this.px;
    }

    @Override
    public Group dessine() {
        Ellipse pt = new Ellipse(this.px, this.py, TAILLE_POINT, TAILLE_POINT);
        pt.setStroke(this.getCouleur());
        pt.setFill(this.getCouleur());
        Group res = new Group(pt);
        return res;
     }

}
