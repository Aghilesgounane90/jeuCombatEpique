package perssonage;

public class Guerrier extends Personnage {

    public Guerrier() {
        super();
        super.nom = "Guerrier";
    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getForce());
    }

    public void attaqueSpeciale(Personnage personnage){
        personnage.setVie(personnage.getVie()-(this.getForce()*2));
        this.setVie(this.getVie()-(this.getForce()/2));
    }
}
