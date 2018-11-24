import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Mage;

import static org.junit.Assert.assertEquals;

public class guerrierTest {

    @Test
    public void Given_Player2_WhenAttaqueBasique_ThenPlayer2PerdPointVie40() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);
        guerrier.attaqueBasique("Guerrier","Mage",mage);
        assertEquals(40,mage.getVie());
    }

    @Test
    public void Given_Player2_WhenAttaqueSpeciale_ThenPlayer2PerdPointVie30Player1PerdPointVie45() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);
        guerrier.attaqueSpeciale("Guerrier","Mage",mage);
        assertEquals(30,mage.getVie());
        assertEquals(45,guerrier.getVie());
    }
}
