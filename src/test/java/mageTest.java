import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Mage;

import static org.junit.Assert.assertEquals;

public class mageTest {

    @Test
    public void Given_Player2_WhenAttaqueBasique_ThenPlayer2PerdPointVie40() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);
        mage.attaqueBasique("Mage","Guerrier",guerrier);
        assertEquals(40,guerrier.getVie());
    }

    @Test
    public void Given_Player2_WhenAttaqueSpeciale_ThenPlayer2PerdPointVie30Player1PerdPointVie50() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);
        mage.attaqueSpeciale("Mage","Guerrier",guerrier);
        assertEquals(50,mage.getVie());

    }

    @Test
    public void Given_Player2_WhenAttaqueSpeciale_ThenPlayer2PerdPointVie30Player1PerdPointVie40() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);

        guerrier.attaqueBasique("Mage","Guerrier",mage);
        guerrier.attaqueBasique("Mage","Guerrier",mage);
        guerrier.attaqueBasique("Mage","Guerrier",mage);
        mage.attaqueSpeciale("Mage","Guerrier",guerrier);
        assertEquals(40,mage.getVie());

    }
}
