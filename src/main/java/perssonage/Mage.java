package perssonage;

public class Mage extends Personnage {

    public Mage() {
        super();
        super.nom = "Mage";
    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getIntelligence());
    }

    public void attaqueSpeciale(Personnage personnage){
        if((this.getVie() + (this.getIntelligence()*2)) <= (this.getNiveau()*5))
        {
            this.setVie(this.getVie() + (this.getIntelligence() * 2));
        }else {
                this.setVie(this.getNiveau()*5);
        }
    }
}
