/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_baudoin;

/**
 *
 * @author arthu
 */
public class Guerrier extends Personnage {
    boolean monter;
    
public Guerrier (String nom, int niv_vie, boolean monter){
    this.niv_vie = niv_vie;
    this.nom = nom;
    this.monter = monter;
    
}
public void monter_ou_descendre(boolean Statut){
    monter = Statut;
    
}

@Override
public String toString(){
    return "nom personnage:" + nom + " niveau de vie:" + niv_vie + ", a cheval ? " + monter;
    
}
    
}
