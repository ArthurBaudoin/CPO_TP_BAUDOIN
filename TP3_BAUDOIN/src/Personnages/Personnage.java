/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.Vector;
/**
 *
 * @author arthu
 */
public class Personnage {
    String nom;
    int niv_vie;
    Vector armes_detenues = new Vector();


public int connaitre_niv_vie (){
    return niv_vie;
}

public boolean ajouter_arme(Arme arme_ajouter){
    if (armes_detenues.size() <5){
        armes_detenues.add(arme_ajouter);
        return true;
    }
    return false; 
}

public String connaitre_nom (){
    return nom;
}

}
