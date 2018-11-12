package perssonage;

public class Rodeur extends Personnage {

    public Rodeur() {
        super();
        super.nom = "Rodeur";
    }

    public void attaqueBasique(String personnage1, String personnage2, Personnage personnage){
        personnage.setVie(personnage.getVie()-this.getAgilite());
        System.out.println(personnage1+" utilise Tir à l’Arc et inflige "+this.getAgilite()+" dommages.");
        System.out.println(personnage2+" perd "+this.getAgilite()+" points de vie");
    }

    public void attaqueSpeciale(String personnage1, String personnage2, Personnage personnage){
        this.setAgilite(this.getAgilite()+(this.getNiveau()/2));
        System.out.println(personnage1+" utilise Concentration et gagne "+(this.getNiveau()/2)+" en Agilité.");
    }

}
