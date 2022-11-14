/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class Arme {
    String nom ;
    int niveau_attaque;
    
public Arme (String nom, int niveau_attaque){
    this.nom = nom;
    this.niveau_attaque = niveau_attaque;
}

public int connaitre_attaque  (){
    return niveau_attaque;
} 

@Override
public String toString(){
    return "nom arme:" + nom + "le niveau d'attaque:" + niveau_attaque;
    
}

public String connaitre_nom (){
    return nom;
}


}

