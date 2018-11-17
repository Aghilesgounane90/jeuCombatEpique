package perssonage;

/**
 * La classe du personnage Rodeur qui hérite de la classe principame Personnage.
 */
public class Rodeur extends Personnage {

    public Rodeur() {
        super();
        super.nom = "Rodeur";
    }

    /**
     *
     * Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getAgilite());
        System.out.println(personnage1+" utilise Tir à l’Arc et inflige "+this.getAgilite()+" dommages.");
        System.out.println(personnage2+" perd "+this.getAgilite()+" points de vie");
        if(personnage.getVie() <= 0){
            System.out.println(personnage2+" est mort");
        }
    }

    /**
     *
     * Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        this.setAgilite(this.getAgilite()+(this.getNiveau()/2));
        System.out.println(personnage1+" utilise Concentration et gagne "+(this.getNiveau()/2)+" en Agilité.");
    }

}
