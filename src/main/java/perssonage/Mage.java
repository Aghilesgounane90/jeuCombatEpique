package perssonage;

public class Mage extends Personnage {

    public Mage() {
        super();
        super.nom = "Mage";
    }

    /**
     *
     * Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getIntelligence());
        System.out.println(personnage1+" utilise Boule de Feu et inflige "+this.getIntelligence()+" dommages.");
        System.out.println(personnage2+" perd "+this.getIntelligence()+" points de vie");
        if(personnage.getVie() <= 0){
            System.out.println(personnage2+" est mort");
        }
    }

    /**
     *
     * Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
     *
     * @param personnage1
     * @param personnage2
     * @param personnage
     */
    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        if((this.getVie() + (this.getIntelligence()*2)) <= (this.getNiveau()*5))
        {
            this.setVie(this.getVie() + (this.getIntelligence() * 2));
            System.out.println(personnage1+" utilise Soin et gagne "+(this.getIntelligence() * 2)+" en vitalité.");
        }else {
                this.setVie(this.getNiveau()*5);
            System.out.println(personnage1+" utilise Soin et gagne "+((this.getNiveau()*5)-this.getVie())+" en vitalité.");
        }
    }
}
