/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_baudoin;

/**
 *
 * @author arthu
 */
public class TP2_manip_BAUDOIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbcalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbcalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbcalories) ;
        
        assiette3.changer_cal(460);
        
        System.out.println("nb de calories de l'assiette2 avec modif assiette3 :"
        + assiette2.nbcalories);
        System.out.println("nb de calories de l'assiette3 avec modif assiette3 :"
        + assiette3.nbcalories);
        
        //cela designe bien le même objet car quand on modifie a3, a2 change elle
        //elle aussi de valeur
        
        assiette2 = assiette1;
        assiette1 = assiette3; // Etant donner que 2 et 3 désigne le même objet
        // 1 et 2 ont donc été intervertie
        
         Moussaka [] Tab = new Moussaka[10]; //création du tableau
    
    for (int i=0 ; i<10 ; i++){ //Création d'une boucle 10 fois
        Tab[i] = new Moussaka(550+i); // apparition d'une mousaka a chaque fois avec 1 ajouté 
        //a chaque ittération 
    }
    System.out.println("calories final du plat:" +Tab[5].nbcalories);
    }
    
}
