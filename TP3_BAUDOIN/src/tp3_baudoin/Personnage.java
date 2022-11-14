/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_baudoin;

/**
 *
 * @author arthu
 */
public class Personnage {
    String nom;
    int niv_vie;
    
public Personnage (String nom, int niv_vie){
    this.niv_vie = niv_vie;
    this.nom = nom;
}

public int connaitre_niv_vie (){
    return niv_vie;
}

@Override
public String toString(){
    return "nom personnage:" + nom + " niveau de vie:" + niv_vie;
    
}

public String connaitre_nom (){
    return nom;
}

}
