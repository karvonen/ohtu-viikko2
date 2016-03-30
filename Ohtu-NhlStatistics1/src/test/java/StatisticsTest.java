
import java.util.ArrayList;
import java.util.List;
import ohtuesimerkki.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatisticsTest {

    Statistics stats;

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    public StatisticsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void searchReturnsFoundPlayer() {
        Player s = stats.search("Kurri");
        assertEquals("Kurri", s.getName());
    }

    @Test
    public void searchReturnsNullIfPlayerNotFound() {
        Player s = stats.search("Tikkanen");
        assertEquals(null, s);
    }
    
    @Test
    public void teamReturnsTheWholeTeam() {
        List<Player> team = stats.team("PIT");
        assertEquals(1, team.size());
        assertEquals("Lemieux", team.get(0).getName());
    }
    
    @Test
    public void topScorers() {
        List<Player> team = stats.topScorers(3);
        assertEquals("Gretzky", team.get(0).getName());
        assertEquals("Lemieux", team.get(1).getName());
        assertEquals("Yzerman", team.get(2).getName());
    }
}
