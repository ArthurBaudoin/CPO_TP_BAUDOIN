/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet;

/**
 *
 * @author arthu
 */
public class Convertisseur {
 int nbConversions;
 
 public Convertisseur () {              //constructeur permettant de compter les conversions
 nbConversions = 0 ;
}

 public double CelciusVersKelvin(double tempCelcius) {       // méthode de convertion de celcius en kelvin 
        nbConversions +=1;                                      // augmente le nb de conversions de 1
        return tempCelcius + 273.15;                            // renvoie la température une fois convertie
    }
 public double KelvinVersCelcius(double tempKelvin) {        // méthode de convertion de Kelvin en Celcius 
        nbConversions +=1;
        return tempKelvin - 273.15;
    }
    public double FarenheitVersCelcius(double tempFarenheit) {  // analogue...
        nbConversions +=1;
        return (tempFarenheit - 32.0)/1.8;
    }
    public double CelciusVersFarenheit(double tempCelcius) {        
        nbConversions +=1;
        return (tempCelcius *1.8 + 32);
    }
    public double FarenheitVersKelvin(double tempFarenheit) {
        nbConversions += 1; 
        return (tempFarenheit-32)/1.8 + 273.15;
    }
    public double KelvinVersFarenheit(double tempKelvin) {
        nbConversions += 1; 
        return (tempKelvin-273.15)*1.8 + 32;
    }
    @Override
    public String toString () {
    return "nb de conversions: "+ nbConversions;
    }











}

    
