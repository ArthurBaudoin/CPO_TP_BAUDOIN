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

        Arme Sword1 = new Epee("Excalibur", 7,5);
        Arme Sword2 = new Epee("Durandal", 4,7);
        Arme Stick1 = new Baton("Chêne", 4,5);
        Arme Stick2 = new Baton("Charme", 5,6);

        Vector tab_dyn = new Vector();
        tab_dyn.add(Sword1);
        tab_dyn.add(Sword2);
        tab_dyn.add(Stick1);
        tab_dyn.add(Stick2);

        for (int i = 0; i < tab_dyn.size(); i++) {
            System.out.println(tab_dyn.elementAt(i));
        }

    }
}
