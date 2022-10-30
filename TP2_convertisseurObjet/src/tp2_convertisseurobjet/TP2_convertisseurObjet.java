/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP2_convertisseurObjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur tempexter = new Convertisseur();       
        tempexter.CelciusVersFarenheit(25.0);       
        tempexter.KelvinVersFarenheit(298.0);
        tempexter.CelciusVersKelvin(25.0);
        System.out.println("pour Température extérieur, " + tempexter + "\n");      // on affiche le nombre de conversions du convertisseur
        Convertisseur tempinter = new Convertisseur();            
        tempinter.CelciusVersFarenheit(30.0);
        tempinter.FarenheitVersKelvin(86.0);
        System.out.println("pour Température intèrieur, " + tempinter + "\n");      // analogue          
        
    
    // Creation d'un menu complet permettant le choix des conversitons
    
      Convertisseur Affichageconvertion = new Convertisseur();
        Scanner sc = new Scanner(System.in);                // création du scanner 
        double TempFinal;                                        // création de la variable qui renverra la valeur convertie
        
        System.out.println("Quelle est la valeur de la température que vous shoutez convertir? ");
        double valeurEntrée = sc.nextDouble();          // demande à l'utilisateur sa valeur à convertir (double)
        
        System.out.println("Quelle conversions voulez vous réaliser ? ");
        System.out.println(" 1) Celcius Vers Kelvin \n 2) Kelvin Vers Celcius \n "
            +"3) Farenheit Vers Celcius \n 4) Celcius Vers Farenheit \n "
            +"5) Farenheit Vers Kelvin \n 6) Kelvin Vers Farenheit ");
        int choix = sc.nextInt();                       // la conversion choisie
        
        if (choix == 1) {                               // converti avec la méthode correspondante à la conversion choisie 
            TempFinal = Affichageconvertion.CelciusVersKelvin(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "K");
        }
        if (choix == 2) {
            TempFinal = Affichageconvertion.KelvinVersCelcius(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "°C");
        }
        if (choix == 3) {
            TempFinal = Affichageconvertion.FarenheitVersCelcius(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "°C");
        }
        if (choix == 4) {
            TempFinal = Affichageconvertion.CelciusVersFarenheit(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "F");
        }
        if (choix == 5) {
            TempFinal = Affichageconvertion.FarenheitVersKelvin(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "K");
        }
        if (choix == 6) {
            TempFinal = Affichageconvertion.KelvinVersFarenheit(valeurEntrée);
            System.out.println("voici le résultat de votre conversion: "+TempFinal + "F");
        }
    }
    
}
