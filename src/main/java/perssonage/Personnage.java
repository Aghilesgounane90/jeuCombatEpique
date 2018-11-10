package perssonage;

import java.util.Scanner;

public class Personnage {

    protected String nom;
    /** Niveau de Personnage*/
    private int niveau;
    /** Vie de Personnage*/
    private int vie;
    /** Force de Personnage*/
    private int force;
    /** Agilité de Personnage*/
    private int agilite;
    /** Intelligence de Personnage*/
    private int intelligence;

    /** Canstructeur sans paramétre */
    public Personnage() {
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getNom() {
        return nom;
    }




}
