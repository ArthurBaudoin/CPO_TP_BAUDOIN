/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_baudoin;

/**
 *
 * @author arthu
 */
public class Magicien extends Personnage {
    boolean confirme;
    
public Magicien (String nom, int niv_vie,boolean confirme){
    this.niv_vie = niv_vie;
    this.nom = nom;
    this.confirme = confirme;
}
public void confirmer_ou_non (boolean Statut){
    confirme = Statut;
}

@Override
public String toString(){
    return "nom personnage:" + nom + " niveau de vie:" + niv_vie + ", confirmé ? " + confirme;
    
}
}
