import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Personnage;

import static org.junit.Assert.assertEquals;

public class choosePlayerTest {

    @Test
    public void Given_1AsPlayer_WhenGettingPlayer_ThenGetGuerrier() {
        Main main = new Main();
        assertEquals("Guerrier", main.choosePlayer(1).getNom());

    }

    @Test
    public void Given_2AsPlayer_WhenGettingPlayer_ThenGetRodeur() {
        Main main = new Main();
        assertEquals("Rodeur", main.choosePlayer(2).getNom());

    }

    @Test
    public void Given_3AsPlayer_WhenGettingPlayer_ThenGetMage() {
        Main main = new Main();
        assertEquals("Mage", main.choosePlayer(3).getNom());

    }
}
