/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_baudoin;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.Vector;

/**
 *
 * @author arthu
 */
public class TP3_BAUDOIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arme Sword1 = new Epee("Excalibur", 7, 5);
        Arme Sword2 = new Epee("Durandal", 4, 7);
        Arme Stick1 = new Baton("Chêne", 4, 5);
        Arme Stick2 = new Baton("Charme", 5, 6);

        Vector tab_dyn = new Vector();
        tab_dyn.add(Sword1);
        tab_dyn.add(Sword2);
        tab_dyn.add(Stick1);
        tab_dyn.add(Stick2);

        for (int i = 0; i < tab_dyn.size(); i++) {
            System.out.println(tab_dyn.elementAt(i));
        }
        Personnage Mag1 = new Magicien("Gandalf", 65, true);
        Personnage Mag2 = new Magicien("Garcimore", 44, false);
        Personnage War1 = new Guerrier("Conan", 78, false);
        Personnage War2 = new Guerrier("Lannister", 45, true);
        
        Vector tab_perso = new Vector();
        tab_perso.add(Mag1);
        tab_perso.add(Mag2);
        tab_perso.add(War1);
        tab_perso.add(War2);
        
        for (int i = 0; i < tab_dyn.size(); i++) {
            System.out.println(tab_perso.elementAt(i));
        }
    }
}
