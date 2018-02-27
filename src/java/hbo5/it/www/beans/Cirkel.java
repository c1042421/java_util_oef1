/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;


import java.lang.Math;
/**
 *
 * @author c1042421
 */
public class Cirkel {
    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }
    
    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }
    
    public void vergrootStraal(double getal){
        straal += getal;
    }   
    
    public double getOmtrek() {
        return 2 * Math.PI * straal;
    }
    
    public double getOppervlakte() {
        return Math.PI * Math.pow(straal, 2);
    }

    @Override
    public String toString() {
        return "De cirkel met straal: " + straal + " heeft als omtrek: " 
                + getOmtrek() + " en als opppervlakte: " + getOppervlakte();
    }
    
    
}
