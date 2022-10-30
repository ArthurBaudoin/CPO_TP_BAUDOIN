/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_baudoin;

/**
 *
 * @author arthu
 */
public class BouteilleBiere { // Type et définition de la class
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
public void lireEtiquette() { // méthode de lecture d'étiquettes
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}

public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //constructeur
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
                
       
                }

  public boolean Decapsuler() {                      // méthode qui permet de décapsuler unebière  
        if (ouverte == false) {                     // et de nous indiquer ci c'est déjà le cas 
            ouverte = true; 
            System.out.println(" bière décapsulée \n");
            return true;
        }
        else {
            System.out.println(" erreur : biere déjà ouverte \n");
            return false;
                    }
} 

  @Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)"
            + "Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}