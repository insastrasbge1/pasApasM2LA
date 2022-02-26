/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.awt.Color;

/**
 *
 * @author francois
 */
public class Point extends FigureSimple{
    
    private double px;
    private double py;
    
    public Point() {
        this(0,0);
    }
    public Point(double px,double py) {
        this(px,py,new Color(0, 0, 0));
    }
    public Point(double px,double py,Color c) {
        super(c);
        this.px = px;
        this.py = py;
    }
    
    public double getPx() {
        return this.px;
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    
    public String toString() {
        return "(" + this.px + "," + this.py + ")";
     }
    
    public static void main(String[] args) {
        Point p1,p2;
        p1 = new Point();
        p1.px = 2;
        p1.py = 3;
        System.out.println("p1 : (" + p1.px + "," + p1.py+")");
        p2 = p1;
        p2.px = 4;
        System.out.println("p2 : (" + p2.px + "," + p2.py+")");
        System.out.println("p1 : (" + p1.px + "," + p1.py+")");
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
    
}
