import game.Game;
import org.junit.Test;
import perssonage.Guerrier;
import perssonage.Personnage;

import static org.junit.Assert.assertEquals;

public class choosePlayerTest {

    @Test
    public void Given_1AsPlayer_WhenGettingPlayer_ThenGetGuerrier() {

        assertEquals("Guerrier", Game.choosePlayer(1).getNom());

    }

    @Test
    public void Given_2AsPlayer_WhenGettingPlayer_ThenGetRodeur() {
        assertEquals("Rodeur", Game.choosePlayer(2).getNom());

    }

    @Test
    public void Given_3AsPlayer_WhenGettingPlayer_ThenGetMage() {
        Main main = new Main();
        assertEquals("Mage", Game.choosePlayer(3).getNom());

    }
}
