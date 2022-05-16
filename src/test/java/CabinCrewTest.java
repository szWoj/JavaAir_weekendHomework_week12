import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Fred", Rank.FIRSTOFFICER);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FIRSTOFFICER, cabinCrew.getRank());
    }

    @Test
    public void canRunService(){
        assertEquals("Crew has started service", cabinCrew.relayToPax());
    }
}
