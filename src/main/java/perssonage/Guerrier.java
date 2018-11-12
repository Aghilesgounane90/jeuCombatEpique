package perssonage;

public class Guerrier extends Personnage {

    public Guerrier() {
        super();
        super.nom = "Guerrier";
    }

    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getForce());
        System.out.println(personnage1+" utilise Coup d’Épée et inflige"+this.getForce()+" dommages.");
        System.out.println(personnage2+" perd "+this.getForce()+" points de vie");
    }

    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-(this.getForce()*2));
        this.setVie(this.getVie()-(this.getForce()/2));
        System.out.println(personnage1+" utilise  Coup de Rage et inflige"+(this.getForce()*2)+" dommages.");
        System.out.println(personnage2+" perd "+(this.getForce()*2)+" points de vie");
        System.out.println(personnage1+" perd "+(this.getForce()/2)+" points de vie");
    }
}
