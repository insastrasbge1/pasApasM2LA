/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

/**
 *
 * @author francois
 */
public abstract class Figure {
    
    private Groupe contenuDans;
    
    public abstract double distancePoint(Point p) ;
    
        public static void main(String[] args) {
        Point p1,p2;
        p1 = new Point();
        p1.setPx(2);
        p1.setPy(3);
        System.out.println("p1 : (" + p1.getPx() + "," + p1.getPy()+")");
       p2 = p1;
        p1.setPx(4);
     }

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
