package perssonage;

/**
 * La classe du personnage Guerrier qui hérite de la classe principame Personnage.
 */
public class Guerrier extends Personnage {

    public Guerrier() {
        super();
        super.nom = "Guerrier";
    }

    public Guerrier( int niveau, int vie, int force, int agilite, int intelligence) {
        super(niveau, vie, force, agilite, intelligence);
        super.nom = "Guerrier";
    }

    /**
     *
     * Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getForce());
        System.out.println(personnage1+" utilise Coup d’Épée et inflige "+this.getForce()+" dommages.");
        System.out.println(personnage2+" perd "+this.getForce()+" points de vie");
        if(personnage.getVie() <= 0){
            System.out.println(personnage2+" est mort");
        }
    }

    /**
     *
     * Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-(this.getForce()*2));
        this.setVie(this.getVie()-(this.getForce()/2));
        System.out.println(personnage1+" utilise  Coup de Rage et inflige "+(this.getForce()*2)+" dommages.");
        System.out.println(personnage2+" perd "+(this.getForce()*2)+" points de vie");
        if(personnage.getVie() <= 0){
            System.out.println(personnage2+" est mort");
        }
        System.out.println(personnage1+" perd "+(this.getForce()/2)+" points de vie");
    }
}
