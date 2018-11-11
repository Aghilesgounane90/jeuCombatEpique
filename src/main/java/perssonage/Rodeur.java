package perssonage;

public class Rodeur extends Personnage {

    public Rodeur() {
        super();
        super.nom = "Rodeur";
    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getAgilite());
    }

    public void attaqueSpeciale(Personnage personnage){
        this.setVie(this.getVie()+(this.getAgilite()/2));
    }

}
