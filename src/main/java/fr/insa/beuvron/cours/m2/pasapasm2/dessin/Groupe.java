/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francois 
 */
public class Groupe extends Figure{
    
    private List<Figure> contient;
    
    public List<Figure> getContient() {
        return this.contient;
    }
    
    public Groupe(List<Figure> lf) {
        this.contient = lf;
    }
    
    public Groupe() {
        this(new ArrayList<Figure>());
    }
    
    public void ajoute(Figure f) {
        if(f.getContenuDans() != null) {
            throw new Error("figure " + f + " déjà dans groupe " +
                    f.getContenuDans());
        }
        this.contient.add(f);
        f.setContenuDans(this);
       
    }
    
    //TODO
    @Override
    public double distancePoint(Point p) {
        return 0;
    }
    
}
