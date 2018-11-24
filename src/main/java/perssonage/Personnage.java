package perssonage;

/**
 * La classe principame Personnage.
 */
public abstract class Personnage {

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

    public Personnage( int niveau, int vie, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
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

    public abstract void attaqueBasique(String personnage1,String personnage2,Personnage personnage);

    public abstract  void attaqueSpeciale(String personnage1,String personnage2,Personnage personnage);


}
