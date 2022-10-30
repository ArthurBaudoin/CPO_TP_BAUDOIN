/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_baudoin;

/**
 *
 * @author arthu
 */
public class TP2_Bieres_Baudoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();

        BouteilleBiere autreBiere = new BouteilleBiere ("Leffe", 6.6 ,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        autreBiere.Decapsuler();
        
        BouteilleBiere troisBiere = new BouteilleBiere ("Tripel Karmeliet", 8.4 ,"Brasserie Bosteels");
        troisBiere.lireEtiquette();
        troisBiere.Decapsuler();
        
        BouteilleBiere quatreBiere = new BouteilleBiere ("Kwak", 8.4 ,"Brasserie Bosteels");
        quatreBiere.lireEtiquette();
        quatreBiere.Decapsuler();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Rince Cochon", 8.5 ,"Haacht");
        cinqBiere.lireEtiquette();
        cinqBiere.Decapsuler();

        
    }
    
}
