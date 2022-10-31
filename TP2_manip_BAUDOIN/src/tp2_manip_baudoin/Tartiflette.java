/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_baudoin;

/**
 *
 * @author arthu
 */
public class Tartiflette {
    int nbcalories;
    
    public Tartiflette(int caloriesDep){
        nbcalories = caloriesDep;
    }
    
    public int changer_cal(int caloriesFin) {
        nbcalories = caloriesFin;
        return nbcalories;
    }
    
}
