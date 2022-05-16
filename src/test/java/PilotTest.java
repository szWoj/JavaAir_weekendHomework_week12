import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Mark", Rank.FIRSTOFFICER, "ABCD1234");

    }

    @Test
    public void hasName(){
        assertEquals("Mark", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.FIRSTOFFICER, pilot.getRank());
    }
    @Test
    public void hasLicenceNo(){
        assertEquals("ABCD1234", pilot.getLicenceNo());
    }

}
