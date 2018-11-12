package perssonage;

public class Mage extends Personnage {

    public Mage() {
        super();
        super.nom = "Mage";
    }

    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getIntelligence());
        System.out.println(personnage1+" utilise Boule de Feu et inflige "+this.getIntelligence()+" dommages.");
        System.out.println(personnage2+" perd "+this.getIntelligence()+" points de vie");
    }

    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        if((this.getVie() + (this.getIntelligence()*2)) <= (this.getNiveau()*5))
        {
            this.setVie(this.getVie() + (this.getIntelligence() * 2));
            System.out.println(personnage1+" utilise Concentration et gagne "+(this.getIntelligence() * 2)+" en vitalité.");
        }else {
                this.setVie(this.getNiveau()*5);
            System.out.println(personnage1+" utilise Concentration et gagne "+((this.getNiveau()*5)-this.getVie())+" en vitalité.");
        }
    }
}
