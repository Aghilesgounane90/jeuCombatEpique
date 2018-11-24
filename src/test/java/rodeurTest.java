import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Mage;
import perssonage.Rodeur;

import static org.junit.Assert.assertEquals;

public class rodeurTest {

    @Test
    public void Given_Player2_WhenAttaqueBasique_ThenPlayer2PerdPointVie40() {
        Rodeur rodeur = new Rodeur(10,50,0,10,0);
        Mage mage = new Mage(10,50,0,0,10);
        rodeur.attaqueBasique("Mage","Guerrier",mage);
        assertEquals(40,mage.getVie());
    }

    @Test
    public void Given_Player2_WhenAttaqueSpeciale_ThenPlayer1Gagne5PointAgilite() {
        Rodeur rodeur = new Rodeur(10,50,0,10,0);
        Mage mage = new Mage(10,50,0,0,10);
        rodeur.attaqueSpeciale("Mage","Guerrier",mage);
        assertEquals(15,rodeur.getAgilite());

    }
}
