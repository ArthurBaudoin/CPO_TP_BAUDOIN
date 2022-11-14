package Armes;


import Armes.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class Baton extends Arme {
    int age; 

    public Baton (String nom,int niveau_attaque, int age){
        this.niveau_attaque = niveau_attaque;
        this.nom = nom;
        this.age = age;
    }
    
    public String toString(){
    return "nom arme: " + nom + ", le niveau d'attaque:" + niveau_attaque + ", age :" + age;   
}
}
