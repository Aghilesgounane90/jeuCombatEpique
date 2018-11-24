import game.Game;
import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Mage;

import static org.junit.Assert.assertEquals;

public class attaqueTest {
    @Test
    public void Given_GuerrierCharacteristicsAsPlayer_WhenChoseCharacteristics_ThenGetViePlayer2() {
        Guerrier guerrier = new Guerrier(10,50,10,0,0);
        Mage mage = new Mage(10,50,0,0,10);
        //assertEquals("Guerrier", Game.attaque("Guerrier","Guerrier",guerrier,mage));

    }
}
