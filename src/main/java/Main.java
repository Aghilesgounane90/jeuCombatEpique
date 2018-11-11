import exeption.InexistentePersonaje;
import perssonage.Guerrier;
import perssonage.Mage;
import perssonage.Personnage;
import perssonage.Rodeur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Création du personnage du joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        Scanner scJoueur1 = new Scanner(System.in);
        int nbJoueur1 = scJoueur1.nextInt();

        Personnage joueur1 = choosePlayer(nbJoueur1);
        joueur1 = choosePlayerCharacteristics(joueur1);
        System.out.println("worg je suis le "+joueur1.getNom()+" niveau "+joueur1.getNiveau()+" je possède "+joueur1.getVie()+"vitalité, "+joueur1.getForce()+" de force "+joueur1.getAgilite()+" d'agilité "+joueur1.getIntelligence()+" d'intelligence");

        System.out.println("Création du personnage du joueur 2");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        Scanner scJoueur2 = new Scanner(System.in);
        int nb = scJoueur2.nextInt();
        Personnage joueur2 = choosePlayer(nb);
        joueur2 = choosePlayerCharacteristics(joueur2);
        System.out.println("Abracadabra je suis le "+joueur2.getNom()+" niveau "+joueur2.getNiveau()+" je possède "+joueur2.getVie()+"vitalité, "+joueur2.getForce()+" de force "+joueur2.getAgilite()+" d'agilité "+joueur2.getIntelligence()+" d'intelligence");

        while(true){
            System.out.println("Joueur 1 ("+joueur1.getVie()+" vitalité) veullez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial");
            Scanner scAttaqueJoueur1 = new Scanner(System.in);
            int attaqueJoueur1 = scAttaqueJoueur1.nextInt();
            switch (attaqueJoueur1){
                case 1 :
                    joueur1.attaqueBasique(joueur2);
                    break;
                case 2 :
                    joueur1.attaqueSpeciale(joueur2);
                    break;
            }
            System.out.println("Joueur 2 ("+joueur1.getVie()+" vitalité) veullez choisir votre action (1 : Attaque Basique, 2 : Attaque Spécial");
            Scanner scAttaqueJoueur2 = new Scanner(System.in);
            int attaqueJoueur2 = scAttaqueJoueur2.nextInt();
            switch (attaqueJoueur1){
                case 1 :
                    joueur2.attaqueBasique(joueur1);
                    break;
                case 2 :
                    joueur2.attaqueSpeciale(joueur1);
                    break;
            }
        }



    }

    /**
     *
     * Methode pour choisir une classe entre Guerrier, Rôdeur, Mage. saisir 1 pour Guerrier, 2 pour Rôdeur et  3 pour Mage
     *
     * @param n
     * @return joueur1
     */
    public static Personnage choosePlayer(int n){
        if(n <1 || n>3)
            throw new InexistentePersonaje();

        Personnage joueur1 = null;
        switch (n){
            case 1:
                joueur1 = new Guerrier();
                break;
            case 2:
                joueur1 = new Rodeur();
                break;
            case 3:
                joueur1 = new Mage();
                break;
        }
        return joueur1;
    }

    /**
     *
     * Methode pour choisir les caractéristique du personnage choisi
     *
     * @param personnage
     * @return Personnage
     */
    public static Personnage choosePlayerCharacteristics(Personnage personnage){

        System.out.println("Niveau du Personnage ?");
        int niveauPersonnage = selectValueValid(1,100);
        personnage.setNiveau(niveauPersonnage);
        personnage.setVie(niveauPersonnage * 5);
        System.out.println("Force du Personnage ?");
        int forcePersonnage = selectValueValid(0,personnage.getNiveau());
        personnage.setForce(forcePersonnage);
        System.out.println("Agilité du Personnage ?");
        int agilitePersonnage = selectValueValid(0,personnage.getNiveau()-personnage.getForce());
        personnage.setAgilite(agilitePersonnage);
        System.out.println("Intelligence du Personnage ?");
        int intelligencePersonnage = selectValueValid(personnage.getNiveau()-(personnage.getForce()+personnage.getAgilite()),personnage.getNiveau()-(personnage.getForce()+personnage.getAgilite()));
        personnage.setIntelligence(intelligencePersonnage);
        return personnage;
    }

    /**
     *
     * Tester si la valeur choisi est entre min et max
     *
     * @param nb
     * @param min
     * @param max
     * @return  boolean
     */
    public static boolean testMinMax(int nb,int min, int max){
        if(nb < min || nb > max){
            System.out.println("Veillez saisir une valeur entre "+min+" et "+max);
            return false;
        }else{
            return true;
        }
    }

    /**
     *
     * Récupere la valeur saisie par le joueur si la valeur et entre min et max sinon un message s'affiche qui invide le joueaur de saisir une nouvel valeur entre min et max
     *
     * @param min
     * @param max
     * @return int
     */
    public static int selectValueValid(int min,int max){
        Scanner sc = new Scanner(System.in);
        boolean validMinMax = false;
        int nb = 50;
        while (!validMinMax){
            nb = sc.nextInt();
            if(testMinMax(nb,min,max)) {
                validMinMax = true;
            }else{
                validMinMax = false;
            }
        }
        return nb;
    }
}
