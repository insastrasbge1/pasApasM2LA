/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class Groupe extends Figure {

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
        if (f.getContenuDans() != null) {
            throw new Error("figure " + f + " déjà dans groupe "
                    + f.getContenuDans());
        }
        this.contient.add(f);
        f.setContenuDans(this);

    }

    //TODO
    @Override
    public double distancePoint(Point p) {
        return 0;
    }

    @Override
    public double maxX() {
        if (this.contient.size() == 0) {
//            throw new Error("groupe vide pas de maxX");
            return 0;
        } else {
            double max = this.contient.get(0).maxX();
            for(int i = 1 ; i < this.contient.size() ; i ++) {
                double cur = this.contient.get(i).maxX();
                if (cur > max) {
                    max = cur;
                }
            }
            return max;
        }
    }

    @Override
    public double minX() {
       if (this.contient.size() == 0) {
//            throw new Error("groupe vide pas de maxX");
            return 0;
        } else {
            double min = this.contient.get(0).minX();
            for(int i = 1 ; i < this.contient.size() ; i ++) {
                double cur = this.contient.get(i).minX();
                if (cur < min) {
                    min = cur;
                }
            }
            return min;
        }
    }
    public static Groupe groupeAlea(int nbrPoint, int nbrSegment) {
        Groupe res = new Groupe();
        for (int i = 0; i < nbrPoint; i++) {
            res.addFigure(new Point(Math.random() * 400, Math.random() * 300,
                    new Color(Math.random(), Math.random(), Math.random(), 1)));
        }
        for (int i = 0; i < nbrSegment; i++) {
            res.addFigure(new Segment(new Point(Math.random() * 400, Math.random() * 300),
                    new Point(Math.random() * 400, Math.random() * 300),
                    new Color(Math.random(), Math.random(), Math.random(), 1)));
        }
        return res;
    }

    public void addFigure(Figure f) {
        if (f.getContenuDans() != null) {
            throw new Error("figure déjà dans groupe");
        }
        this.getContient().add(f);
        f.setContenuDans(this);
    }


}
